package com.example.board.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.board.dao.MemberDao;
import com.example.board.domain.Member;
import com.example.board.domain.MemberRegRequest;

@Service
public class MemberRegService {

	private MemberDao dao;
	String bucketName = "aiacademytestbucket";
	
	@Autowired
	private SqlSessionTemplate template;
	
//	@Autowired
//	private MailSenderService mailSenderService;

	// 파일을 업로드, 데이터베이스 저장
	@Transactional
	public int memberReg(MemberRegRequest regRequest, HttpServletRequest request) {
		
		int result = 0;
		
		File newFile = null;
		String newFileName = null;
		
		if(regRequest.getUserPhoto() != null && !regRequest.getUserPhoto().isEmpty()) {
			// 웹 경로
			String uploadPath = "/fileupload/member";
			// 시스템의 실제 경로
			String saveDirPath = request.getSession().getServletContext().getRealPath(uploadPath);
			// 새로운 파일 이름
			newFileName = regRequest.getUserid() + System.currentTimeMillis();
			newFile = new File(saveDirPath, newFileName);
			
			/* 파일 저장 */
			try {
				regRequest.getUserPhoto().transferTo(newFile);
				
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		Member member = regRequest.toMember();
		if(newFileName != null) {
			member.setMemberphoto(newFileName);
		}

		//try {
			// 데이터 베이스 입력
			dao = template.getMapper(MemberDao.class);
			
			// member_count > memberCount + 1 update
			dao.memberCountUpdate();
			
			// 회원 DB insert
			result = dao.insertMember(member);
			
			
		/*} catch (Exception e) {
			e.printStackTrace();
			// 현재 저장한 파일이 있다면??!! -> 삭제
			if (newFile != null && newFile.exists()) {
				newFile.delete();
			}
		}*/

		return result;
	}

}
