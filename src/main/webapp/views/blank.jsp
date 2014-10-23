<!DOCTYPE html>
<html id="ng-app" ng-app="app">
<head>
<title><%=request.getAttribute("title")%></title>
<%
	if(request.getContextPath()!="")
		out.println("<base href=\""+request.getContextPath()+"/\" />");
	else{
		out.println("<base href=\"/\" />");
	}
%>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />

<meta name="description" content="overview &amp; stats" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<link rel="stylesheet" href="assets/css/c2-all.css" />

<link rel="stylesheet" href="css/custom.css" />

<script src="assets/ace-extra.min.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <link rel="stylesheet" href="assets/compatible/ace-part2.min.css"/>
    <link rel="stylesheet" href="assets/compatible/ace-ie.min.css"/>
    <script src="assets/compatible/html5shiv.js"></script>
    <script src="assets/compatible/respond.min.js"></script>
<![endif]-->
</head>

<body ng-controller="BlankPageController" class="no-skin">
	<div id="directives"></div>
	<div class="page-content clearfix">
		<div id="view">
			<div ng-include="'<%=request.getAttribute("url")%>'"></div>
		</div>
	</div>
	<!-- basic scripts -->
	<script src="assets/jquery.min.js"></script>
	<script type="text/javascript">
		$.ajaxSetup({
			async : false
		});
		$("#directives").load("ui/dir/directives.html");
		$.ajaxSetup({
			async : true
		});
	</script>

	<!--[if lt IE 9]>
	<script>
   	 //optional need to be loaded before angular-file-upload-shim(.min).js
    	FileAPI = {
        //only one of jsPath or jsUrl.
        jsUrl: 'assets/compatible/FileAPI.min.js',

        //only one of staticPath or flashUrl.
        flashUrl: 'assets/compatible/FileAPI.flash.swf'
    }
	</script>
	<script src="assets/compatible/angular-file-upload-shim.min.js"></script>
	<![endif]-->
	<!--[if !IE]> -->
	<script
		src="assets/compatible/angular-file-upload-html5-shim.min.js"></script>
	<!-- <![endif]-->

	<script src="assets/js/c2-all.js"></script>
	<script src="ui/dir/directives.js"></script>

	<script type="text/javascript">
		app.controller('BlankPageController',['$scope','$http','SecurityFactory',
				function($scope,$http,SecurityFactory) {
					$scope.subject = SecurityFactory.getSubject();
					if (angular.isUndefined($scope.subject)) {
						$http.get("ws/getSubject").success(function(data) {
							if (!angular.isUndefined(data)
									&&!angular.isUndefined(data.result)) {
										$scope.subject = data.result;
									} else {
										$scope.subject = undefined;
									}
									}).error(function() {
										$scope.subject = undefined;
									});
								}
					}]);
	</script>
</body>
</html>
