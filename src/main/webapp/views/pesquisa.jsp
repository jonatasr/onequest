<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

	<div id="conteudo_pesquisa" class="float_esquerda">
	
		<sf:form modelAttribute="pesquisa" action="salvarPesquisa"
			enctype="multipart/form-data" class="form-horizontal" id="form_pesquisa">
	
			<fieldset>
				<div id="legend">
					<legend class="">Pesquisa</legend>
				</div>
			<div id="pesquisa_titulo" class="float_esquerda">
				<span class="float_esquerda">
					Titulo da Pesquisa
					<sf:input path="titulo" placeholder="Titulo" class="input-xlarge" id="textinput" />
				</span>
				<span class="float_esquerda">
					Descrição da Pesquisa
					<sf:input path="descricao" placeholder="Descricao" class="input-xlarge" id="textinput" />
				</span>
				<span class="float_esquerda">
					<a class="btn btn-info" href="#" id="btn_criar_pesquisa">Criar Pesquisa</a>
				</span>
			</div>
				<div id="pesquisa_componentes">
				
				</div>
			
			</fieldset>
		</sf:form>
	</div>

