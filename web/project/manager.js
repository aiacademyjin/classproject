// 회원정보 Member 객체들을 저장하는 배열
var members = []; // object -> 문자열  JSON

// 생성자 함수 Member

function Member(id, pw, name) {
    this.userid = id;
    this.userpw = pw;
    this.username = name;
}

Member.prototype.makeHtml = function (index) {

    console.log(this.userid + ' : ' + this.userpw + ' : ' + this.username);

    var memberHtml = '';
    memberHtml += '<tr>';
    memberHtml += ' <td>' + index + '</td>';
    memberHtml += ' <td>' + this.userid + '</td>';
    memberHtml += ' <td>' + this.userpw + '</td>';
    memberHtml += ' <td>' + this.username + '</td>';
    memberHtml += ' <td><a href="javascript:editMember(' + index + ')">수정</a> <a href="javascript:delmember(' + index + ')">삭제</a></td>';
    memberHtml += '</tr>';

    return memberHtml;

}



window.onload = function () {

    // localStorage 저장하는 key -> members
    // localStorage.getItem('members') 저장 값이 없으면 null 반환
    if (localStorage.getItem('members') == null) {
        // 초기배열 저장 : 배열을 문자열로 변경해서 저장
        localStorage.setItem('members', JSON.stringify(members));
    } else {
        members = JSON.parse(localStorage.getItem('members'));
        
        console.log(members);
        
        setlist();

    }


}

/*function load(){    
   alert('외부 스크립트 파일에서 로드'); 
}*/



function regmember() {

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
    if (userid.value.trim().length < 1) {
        document.querySelector('#userid+div.msg').style.display = 'block';
        check = true;
    }
    if (pw.value.trim().length < 1) {
        document.querySelector('#pw+div.msg').style.display = 'block';
        check = true;
    }
    if (repw.value.trim().length < 1 || pw.value != repw.value) {
        document.querySelector('#repw+div.msg').style.display = 'block';
        check = true;
    }
    if (username.value.trim().length < 1) {
        document.querySelector('#username+div.msg').style.display = 'block';
        check = true;
    }


    /*userid.onfocus = function(){
        document.querySelector('#userid+div.msg').style.display='none';
    }*/

    userid.addEventListener('focus', function () {
        document.querySelector('#userid+div.msg').style.display = 'none';
        userid.value = '';
    });

    pw.addEventListener('focus', function () {
        document.querySelector('#pw+div.msg').style.display = 'none';
        pw.value = '';
    });

    repw.addEventListener('focus', function () {
        document.querySelector('#repw+div.msg').style.display = 'none';
        repw.value = '';
    });

    username.addEventListener('focus', function () {
        document.querySelector('#username+div.msg').style.display = 'none';
        username.value = '';
    });

    console.log(check);

    if (check) {
        return false;
    }


    /*var member = {
        memberid: userid.value,
        pw: pw.value,
        membername: username.value
    };*/

    var member = new Member(userid.value, pw.value, username.value);

    //console.log('member', member);
    member.makeHtml()

    // 배열에 회원 정보를 저장
    members.push(member);

    console.log('members', members);

    document.querySelector('#regform').reset();

    alert('등록되었습니다.');

    // localStorage 저장
    localStorage.setItem('members', JSON.stringify(members));

    // 리스트 갱신
    setlist();



    return false;
}


// 리스테이블의 정렬
function setlist() {

    // table tbody 캐스팅
    var listrow = document.querySelector('#listrow');

    var tbody = '<tr>';
    tbody += '<th>순번(index)</th>';
    tbody += '<th>아이디</th>';
    tbody += '<th>비밀번호</th>';
    tbody += '<th>이름</th>';
    tbody += '<th>관리</th>';
    tbody += '</tr>';

    for (var i = 0; i < members.length; i++) {
        //tbody += members[i].makeHtml(i);
        
        tbody += '<tr>';
        tbody += ' <td>' + i + '</td>';
        tbody += ' <td>' + members[i].userid + '</td>';
        tbody += ' <td>' + members[i].userpw + '</td>';
        tbody += ' <td>' + members[i].username + '</td>';
        tbody += ' <td><a href="javascript:editMember(' + i + ')">수정</a> <a href="javascript:delmember(' + i + ')">삭제</a></td>';
        tbody += '</tr>';
        
    }

    listrow.innerHTML = tbody;
}


// 배열의 데이터를 삭제
function delmember(index) {

    var delChk = confirm('삭제하시겠습니까?');

    if (delChk) {

        // 삭제 -> 배열에서 요소를 삭제
        members.splice(index, 1);

        // localStorage 저장
        localStorage.setItem('members', JSON.stringify(members));


        alert('삭제되었습니다.');



        // 배열의 변경된 내용으로 리스트 출력
        setlist();

    }

}

function editMember(index) {
    console.log(members[index]);

    // 수정 화면 캐스팅
    var editDiv = document.querySelector('div.edit_div');
    editDiv.style.display = 'block';

    // form 안에 있는 input 캐스팅
    // id    
    var eid = document.querySelector('#editid');
    // name
    var ename = document.querySelector('#editname');
    // pw
    var epw = document.querySelector('#editpw');
    // repw
    var erepw = document.querySelector('#editrepw');
    // index
    var idx = document.querySelector('#index');

    idx.value = index;
    eid.value = members[index].userid;
    ename.value = members[index].username;
    epw.value = members[index].userpw;
    erepw.value = members[index].userpw;

}

function editMemberData() {
    // 캐스팅
    // index
    var eidx = document.querySelector('#index').value;
    // id
    // var eid = document.querySelector('#editid');
    // pw
    var epw = document.querySelector('#editpw');
    // repw
    var erepw = document.querySelector('#editrepw');
    // name
    var ename = document.querySelector('#editname');


    // editpw > msg
    var pw_msg = document.querySelector('#editpw+div.msg');
    var repw_msg = document.querySelector('#editrepw+div.msg');
    var ename_msg = document.querySelector('#editname+div.msg');


    var check = false; // 문제 없다

    // 공백문자를 검사 : trim()을 이용해서 공백 제거 후 문자열 비교
    if (epw.value.trim().length < 1) {
        pw_msg.style.display = 'block';
        check = true;
    }
    if (erepw.value.trim().length < 1 || pw.value != repw.value) {
        repw_msg.style.display = 'block';
        check = true;
    }
    if (ename.value.trim().length < 1) {
        ename_msg.style.display = 'block';
        check = true;
    }


    epw.addEventListener('focus', function () {
        pw_msg.style.display = 'none';
        epw.value = '';
    });

    erepw.addEventListener('focus', function () {
        repw_msg.style.display = 'none';
        erepw.value = '';
    });

    ename.addEventListener('focus', function () {
        ename_msg.style.display = 'none';
        ename.value = '';
    });

    console.log(check);

    if (check) {
        return false;
    }

    // members[index] -> pw, name 수정
    members[eidx].username = ename.value.trim();
    members[eidx].userpw = epw.value;
    
    // localStorage 저장
    localStorage.setItem('members', JSON.stringify(members));

    alert('수정되었습니다.');

    // 회원 리스트 갱신
    setlist();

    document.querySelector('#editform').reset();
    document.querySelector('div.edit_div').style.display = 'none';


    return false;

}


function editMemberClose() {
    // 수정 화면 캐스팅
    var editDiv = document.querySelector('div.edit_div');
    editDiv.style.display = 'none';
}
