<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- <link rel="icon" href="../../../../favicon.ico"> -->

    <title>Offcanvas template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/bootstrap/offcanvas.css" rel="stylesheet">
  </head>

  <body class="bg-light">

    <nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
      <a class="navbar-brand mr-auto mr-lg-0" href="#">BITCAMP</a>
      <button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Dashboard <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Notifications</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Profile</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Switch account</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Settings</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="#">Action</a>
              <a class="dropdown-item" href="#">Another action</a>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>

    <div class="nav-scroller bg-white box-shadow">
      <nav class="nav nav-underline">
        <a class="nav-link active" href="#">Dashboard</a>
        <a class="nav-link" href="#">
          Friends
          <span class="badge badge-pill bg-light align-text-bottom">27</span>
        </a>
        <a class="nav-link" href="#">Explore</a>
        <a class="nav-link" href="#">Suggestions</a>
        <a class="nav-link" href="#">Link</a>
        <a class="nav-link" href="#">Link</a>
        <a class="nav-link" href="#">Link</a>
        <a class="nav-link" href="#">Link</a>
        <a class="nav-link" href="#">Link</a>
      </nav>
    </div>

    <main role="main" class="container">
      <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
        
        <div class="lh-100">
          <h1 class="mb-0 text-white lh-100">Member List</h1>
          <small>member info</small>
        </div>
      </div>

      <div class="my-3 p-3 bg-white rounded box-shadow" id="member_list">
        <h6 class="border-bottom border-gray pb-2 mb-0">Recent updates</h6>
        
        
        
        
        
        
      </div>

      
    </main>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
    <script>window.jQuery || document.write('<script src="js/assets/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="js/assets/vendor/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <script src="js/assets/js/vendor/holder.min.js"></script>
    <script src="js/bootstrap/offcanvas.js"></script>
    
    
    
    <script>
    	
    	$(document).ready(function(){
    		
    		$.ajax({
    			url : 'http://localhost:8080/op/rest/ver1/members',
    			type : 'GET',
    			success : function(data){
    				console.log(data);
    				//alert(data);
    				//alert(JSON.stringify(data));
    				
    				$.each(data, function(index, item){
    					var html = ' <div class="media text-muted pt-3">';
  	    		    //html += '     <img data-src="" alt="" class="mr-2 rounded">';
  	    		    html += '       <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">';
  	    		    html += '        <strong class="d-block text-gray-dark">'+item.memberid+' ( '+item.membername+' )</strong>';
  	    		    html += '        ' + item.memberphoto;
  	    		    html += '      </p>';
  	    		    html += '    </div>';
  	    		    
  	    		    $('#member_list').append(html);
	
    				});
    				
    				    				
    				
    				
    				
    			},
    			error : function(e){
    				console.log("에러발생!! : ", e);
    			}
    		});
    		
    		
    		
    	});
    
    </script>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  </body>
</html>
