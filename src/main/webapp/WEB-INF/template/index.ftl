<!DOCTYPE html>
<html lang="ja">
	<head>
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="content-script-type" content="text/javascript">
		<title>Download Test Page</title>
		<link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css" rel="stylesheet" />
		<link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/font/material-design-icons/Material-Design-Icons.svg" rel="stylesheet">
	</head>
	<body>
		<div class="row">
			<div class="col s6 m6 offset-s3 offset-m3">
				<div class="card white z-depth-2">
					<form role="form" action="/pdf" method="post">
						<div class="card-content col s12 m12">
							<span class="card-title">ダウンロードテスト</span>
						</div>
						<div class="card-action">
<!--
							<button class="btn waves-effect waves-light csvDownload">CSV</button>
-->
							<button class="btn waves-effect waves-light csvDownload">PDF</button>
						</div>
					</form>
				</div>
			</div>
		</div>

		<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
	</body>
</html>