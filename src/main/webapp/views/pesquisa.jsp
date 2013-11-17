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
			<div id="pesquisa_titulo" class="float_esquerda" data-action="<c:url value='/pesquisa/create/'/>">
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
				<button id="add_questao" class="btn btn-info" >
					Add Questão.
				</button>
			</div>
			
			<hr/>
			
			
			<div id="pesquisa_componentes" >
				
				
				<div id="questao_div">
					<span id="questao_num"></span>
						<input type="text" id="questao_input" />
					
					
					<span>Tipo
						<select >
							<option selected value="Selecione">Selecione!</option>
							<option value="0">Aberta</option>
							<option value="1">Multipla Escolha</option>
							<option value="2">Escolha Unica</option>
						</select>
					</span>
					
					<span>Obrigatorio
						<select>
							<option selected value="Selecione">Selecione!</option>
							<option value="0">Sim</option>
							<option value="1">Não</option>
						</select>
					</span>
					
					<span>Observação
						<textarea rows="4" cols="100">
						
						</textarea>
					</span>
				</div>
				
				<button class="btn btn-info" >Nova Questão</button>
				
			</div>
			
			</fieldset>
		</sf:form>
	</div>

