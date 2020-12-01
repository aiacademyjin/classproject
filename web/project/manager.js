
window.onload = function(){
    //alert('외부 스크립트 파일에서 로드');
    
}

/*function load(){    
   alert('외부 스크립트 파일에서 로드'); 
}*/

function regmember(){
    
    // 사용자가 입력한 데이터를 확인
    // 유효성 검사
    // 사용자 정보를 저장하는 객체를 생성
    
    // 아이디
    var userid = document.querySelector('#userid');
    // 비밀번호
    var pw = document.getElementById('pw');
    // 비밀번호 확인
    var repw = document.getElementById('repw');
    // 이름
    var username = document.querySelector('#username');
    
    var check = false; // 문제 없다
    
    // 공백문자를 검사 : trim()을 이용해서 공백 제거 후 문자열 비교
    if(userid.value.trim().length<1){
        document.querySelector('#userid+div.msg').style.display='block';
        check=true;
    }
    if(pw.value.trim().length<1){
        document.querySelector('#pw+div.msg').style.display='block';
        check=true;
    }    
    if(repw.value.trim().length<1 || pw.value!=repw.value){
        document.querySelector('#repw+div.msg').style.display='block';
        check=true;
    }
    if(username.value.trim().length<1){
        document.querySelector('#username+div.msg').style.display='block';
        check=true;
    }
    
    
    /*userid.onfocus = function(){
        document.querySelector('#userid+div.msg').style.display='none';
    }*/
    
    userid.addEventListener('focus',function(){
        document.querySelector('#userid+div.msg').style.display='none';
        userid.value='';
    });
    
    pw.addEventListener('focus',function(){
        document.querySelector('#pw+div.msg').style.display='none';
        pw.value='';
    });
    
    repw.addEventListener('focus',function(){
        document.querySelector('#repw+div.msg').style.display='none';
        repw.value='';
    });
    
    username.addEventListener('focus',function(){
        document.querySelector('#username+div.msg').style.display='none';
        username.value='';
    });
    
    console.log(check);
    
    if(check){
        return false;
    }
    
    
    var member = {
        memberid: userid.value,
        pw: pw.value,
        membername: username.value
    };
    
    console.log('member', member);
    
    
    
    return false;
}













