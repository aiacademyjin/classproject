<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int result = 0;

	// DAO 객체의 insert 메소드로 member참조변수 전달, Connection 객체의 참조변수 전달
	Connection conn = ConnectionProvider.getConnection();

	// MemberDao dao = new MemberDao();
	MemberDao dao = MemberDao.getInstance();

	if (conn != null) {

		// 폼의 입력한 사용자 입력 데이터의 한글 처리
		//request.setCharacterEncoding("utf-8");
	
		String userId = null;
		String pw = null;
		String userName = null;
		String userPhoto = null;

		// FileUpload 라이브러리를 이용해서 DB에 입력할 데이터를 받아와야한다.
		if (ServletFileUpload.isMultipartContent(request)) {

			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List<FileItem> items = upload.parseRequest(request);

			Iterator<FileItem> itr = items.iterator();
		
			while (itr.hasNext()) {
				
				FileItem item = itr.next();
						
					// type=file 여부 확인 -> 각각 필드의 값을 추출
					if (item.isFormField()) { // 일반 필드
					
						String fName = item.getFieldName();
						
						if (fName.equals("userid")) {
							userId = item.getString("urf-8");
						}
						if (fName.equals("pw")) {
							pw = item.getString("urf-8");
						}
						if (fName.equals("username")) {
							userName = item.getString("urf-8");
						}
						
					} else { // file 필드
						
						if(item.getFieldName().equals("userPhoto") && !item.getName().isEmpty() && item.getSize()>0){
							
							//   /upload/member
							String dir = request.getSession().getServletContext().getRealPath("/upload/member");
							
							// 경로 저장하는 File 객체를 생성
							File saveFilePath = new File(dir);
							
							// 폴더가 존재하는지 여부
							if(!saveFilePath.exists() || !saveFilePath.isDirectory()){
								saveFilePath.mkdir();
							}
							
							
							// a 사용자가 photo.jpg    b 사용자가 photo.jpg
							// mini.jpg		--> {"mini","jpg"}	
							// 새로운 파일 이름 : 중복하는 파일의 이름이 있으면 덮어쓴다 -> 
							String newFileName = System.nanoTime()+"."+item.getName().split(".")[1] ;
							
							// 파일 저장
							item.write(new File(saveFilePath, newFileName));
							userPhoto = newFileName;
						}
				}
		}

		Member member = new Member();
		member.setUserId(userId);
		member.setPassword(pw);
		member.setUserName(userName);
		member.setUserPhoto(userPhoto);

		System.out.println(member);

		// DB에 데이터 저장
		result = dao.insertMember(conn, member);

	}

}

	request.setAttribute("result", result);
%>
<jsp:forward page="memberRegView.jsp" />











