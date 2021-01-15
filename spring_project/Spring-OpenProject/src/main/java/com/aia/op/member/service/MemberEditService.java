package com.aia.op.member.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;
import com.aia.op.member.domain.MemberEditRequest;

@Service
public class MemberEditService {

	private MemberDao dao;

	@Autowired
	private SqlSessionTemplate template;

	public Member getMember(int idx) {
		dao = template.getMapper(MemberDao.class);
		return dao.selectMemberByIdx(idx);
	}

	public int editMember(
			MemberEditRequest editRequest, 
			HttpServletRequest request) {

		int result = 0;

		// 웹 경로
		String uploadPath = "/fileupload/member";
		// 시스템의 실제 경로
		String saveDirPath = request.getSession().getServletContext().getRealPath(uploadPath);
		
		String newFileName = null;
		File newFile = null;
		
		// 1. 파일 처리 : 업로드할 새로운 파일이 존재하면
		if (!editRequest.getUserPhoto().isEmpty()) {
			// 새로운 파일 이름
			newFileName = editRequest.getUserid() + System.currentTimeMillis();
			newFile = new File(saveDirPath, newFileName);
			// 파일 저장
			try {
				editRequest.getUserPhoto().transferTo(newFile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 수정할 데이터를 가지는 Member -> MemberDao
		Member member = editRequest.getToMember();
		
		// 수정할 파일 이름 설정
		if(newFileName == null) {
			member.setMemberphoto(editRequest.getOldPhoto());
		} else {
			member.setMemberphoto(newFileName);
		}		

		try {
		// 2. DB : update
		dao = template.getMapper(MemberDao.class);
		
		result = dao.updateMember(member);
		
		} catch (Exception e) {
			e.printStackTrace();
			
			// 저장된 파일을 삭제
			if(newFile !=null && newFile.exists()) {
				newFile.delete();
			}
		}
		
		if(newFile != null && !editRequest.getOldPhoto().equals("default.png") ) {
			new File(saveDirPath,editRequest.getOldPhoto()).delete();
		}

		return result;
	}

}
