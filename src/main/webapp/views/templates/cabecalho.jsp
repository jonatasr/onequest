<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


<div class="navbar navbar-fixed-top">
	<div class="navbar-inner ">
		<div class="container">
		
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-align-justify"></span>
          </a>
		
			<a class="brand" href="<c:url value='/'/>"><img
				src="<c:url value="/recursos/images/logo_onequest.png"/>" alt="" /></a>
			<div class="nav-collapse">
				<ul class="nav">
					<li class="active"><a href="<c:url value='/'/>">Página principal</a></li>
					<li><a  href="<c:url value='/tutorial/show'/>">Tutorial</a></li>
					<li><a href="#">Exemplos</a></li>
					<li><a href="<c:url value='/contato/show'/>">Contato</a></li>
					<li> <a href="<c:url value='/sobre/show'/>">Equipe</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->

			<div class="nav pull-right" id="btn_cadastro">
				<a class="btn btn-info" href="<c:url value='/registro'/>"><i
					class="icon-pencil icon-white"></i> Cadastrar-se </a>
			</div>
			<div class="nav pull-right" id="form_login">
				<sec:authorize access="isAnonymous()">

					<form class="form-inline"
						action="<c:url value="/j_spring_security_check"/>" method="post">
						<div class="input-prepend">
							<span class="add-on"><i class="icon-user"></i></span> <input
								type="text" class="input-medium" placeholder="Login"
								name="j_username">
						</div>
						<div class="input-prepend">
							<span class="add-on"><i class="icon-lock"></i></span> <input
								type="password" class="input-medium" placeholder="Senha"
								name="j_password">
						</div>
						<button type="submit" id="singlebutton" name="singlebutton"
							class="btn btn-info">Entrar</button>

					</form>

				</sec:authorize>
				<sec:authorize access="isAuthenticated()">
				<div id="user_login">
					<span>
					
						Bem vindo(a)<a class="btn-link" href="<c:url value='/usuario/configuracao/' /><sec:authentication property="details.id" />"> <sec:authentication property="principal" /> </a>- <a
							href="<c:url value="/j_spring_security_logout"/>">Sair</a>
					</span>
					<div class="nav pull-right" id="btn_usuario">
						<a class="btn btn-info" href="<c:url value='/pesquisa/show/'/><sec:authentication property="details.id" />"><i
						class="icon-pencil icon-white"></i>Criar Pesquisa</a>
					</div>
				</div>
				</sec:authorize>

			</div>
		</div>


		</div>

	</div>
	<!-- /.container -->

<!-- /.navbar-inner -->


