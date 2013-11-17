<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%-- <div class="row">
	<div class="four columns">
		<h4>Bem vindo(a) ao Spring F&oacute;rum</h4>
		<p>Esperamos poder lhe ajudar a dominar o m&aacute;ximo poss&iacute;vel todos os conceitos por tr&aacute;s do Spring Framework e seus projetos relacionados</p>
	</div>
	<div class="eight columns">
	<sf:form modelAttribute="usuario" action="executarRegistro" enctype="multipart/form-data">
		<label for="nome">Nome:<sf:errors path="nome" cssClass="erro"/></label>
		<sf:input path="nome" class="four"/>
		
		<label for="email">Email:<sf:errors path="email" cssClass="erro"/></label>
		<sf:input path="email" class="four"/>
		
		
		<label for="login">Nome do usu&aacute;rio (login):<sf:errors path="login" cssClass="erro"/></label>
		<sf:input path="login" class="three"/>
		<label for="senha">Senha:</label>
		<sf:password path="senha" class="three"/>
		<label for="avatar">Avatar:</label>
		<input type="file" name="avatar"/>
		
		
		<input type="submit" value="Fa&ccedil;a parte!" class="tiny button success"/>
	</sf:form>
	</div>
</div> --%>

<div id="cadastro">
	<div class="well span8">


		<sf:form modelAttribute="usuario" action="executarRegistro"
			enctype="multipart/form-data" class="form-horizontal" id="form_cadastro">

			<fieldset>
				<div id="legend">
					<legend class="">Cadastre-se</legend>
				</div>

				<div class="control-group">
					<!-- Nome do usuário -->
					<div class="input-prepend">
					<label class="control-label" for="nome">Nome<sf:errors
								path="nome" cssClass="erro" /></label>
						<div class="controls">
							<span class="add-on"><i class="icon-user"></i></span>
							<sf:input path="nome" class="input-xlarge"
								placeholder="Nome completo" id="textinput" />
						</div>
					</div>
				</div>


				<div class="control-group">
					<!-- Username -->
					<div class="input-prepend">
						<label class="control-label" for="login">Login:<sf:errors
								path="login" cssClass="erro" /></label>
						<div class="controls">
							<span class="add-on"><i class="icon-user"></i></span>
							<sf:input path="login" placeholder="Login"
								class="input-xlarge" id="textinput" />
						</div>
					</div>
				</div>

				<div class="control-group">
					<!-- E-mail -->
					<div class="input-prepend">
						<label class="control-label" for="email">E-mail<sf:errors
								path="email" cssClass="erro" /></label>
						<div class="controls">
							<span class="add-on"><i class="icon-envelope"></i></span>
							<sf:input path="email" id="textinput" placeholder="E-mail"
								class="input-xlarge" />
						</div>
					</div>
				</div>

				<div class="control-group">
					<!-- Senha -->
					<div class="input-prepend">
						<label class="control-label" for="password">Senha</label>
						<div class="controls">
							<span class="add-on"><i class="icon-lock"></i></span>
							<sf:password path="senha" placeholder="Escolha uma senha"
								class="input-xlarge" />
						</div>
					</div>
				</div>

				<%-- <div class="control-group">
					<!-- Confirmar senha-->
					<div class="input-prepend">
						<label class="control-label" for="password_confirm">Confirmar
							senha</label>
						<div class="controls">
							<span class="add-on"><i class="icon-lock"></i></span>
							<sf:password path="senha" placeholder="Confirme a senha"
								class="input-xlarge" />
						</div>
					</div>
				</div> --%>

				<div class="control-group">
					<!-- Botão cadastrar-->
					<div class="controls">
						<button class="btn btn-info" type="submit">Cadastrar</button>
					</div>
				</div>


			</fieldset>
		</sf:form>

	</div>
</div>