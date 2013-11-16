<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div id="header">

	<div class="dropdown">
		<!-- Link or button to toggle dropdown -->
		<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
			<li role="presentation"><a role="menuitem" tabindex="-1"
				href="#">Action</a></li>
			<li role="presentation"><a role="menuitem" tabindex="-1"
				href="#">Another action</a></li>
			<li role="presentation"><a role="menuitem" tabindex="-1"
				href="#">Something else here</a></li>
			<li role="presentation" class="divider"></li>
			<li role="presentation"><a role="menuitem" tabindex="-1"
				href="#">Separated link</a></li>
		</ul>
	</div>

	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner ">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">OneQuest</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="#">Página principal</a></li>
						<li><a href="#">Link</a></li>
						<li><a href="#">Link</a></li>
						<li class="dropdown"><a data-toggle="dropdown"
							class="dropdown-toggle" href="#">Dropdown<strong
								class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li><a href="#">Link 1</a></li>
								<li><a href="#">Link 2</a></li>
								<li><a href="#">Link 3</a></li>
								<li class="divider"></li>
								<li class="nav-header">Nav header</li>
								<li><a href="#">Link 1</a></li>
								<li><a href="#">Link 2</a></li>
							</ul></li>
					</ul>
					<ul class="nav pull-right">
						<a class="btn btn-info" href="account.html"><i
							class="icon-pencil icon-white"></i> Cadastrar-se </a>

					</ul>

				</div>


			</div>
			<!--/.nav-collapse -->
		</div>
		<!-- /.container -->
	</div>
	<div class="form_top">
		<form class="form-inline">

			<div class="input-prepend">
				<span class="add-on"><i class="icon-envelope"></i></span> <input
					type="text" class="input-medium" placeholder="Email">
			</div>


			<div class="input-prepend">
				<span class="add-on"><i class="icon-lock"></i></span> <input
					type="password" class="input-medium" placeholder="Senha">
			</div>


			<button type="submit" id="singlebutton" name="singlebutton"
				class="btn btn-primary">Entrar</button>
		</form>
		<!-- /.navbar-inner -->
	</div>
</div>


</div>