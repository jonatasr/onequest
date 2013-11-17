<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<div class="frame float_esquerda" style="min-height: 3716px;">
	<div class="sidebar">
		<div class="wrapper">

			<a href="#" class="profile"> <img src="" class="avatar pull-left"
				width="30" style="margin-right: 15px; border-radius: 4px">
				${usuario.nome}
			</a>

			<ul class="nav nav-list">
				<li class="nav-header">Pesquisas</li>
				<li class="active"><a href="<c:url value='/pesquisa/show/'/><sec:authentication property="details.id" />"><i
						class="icon-star icon-white"></i>Nova Pesquisa</a></li>
				<li><a href="#"><i class="icon-comment icon-white"></i>Grupo
						de Respondentes</a></li>
				<li><a href="#"><i class="icon-list-alt icon-white"></i>Painel
						de Pesquisas</a></li>
				<li>
				<li class="nav-header">Úteis</li>
				</li>
				<li><a href="#"><i class="icon-user icon-white"></i>Dados
						de Usuário</a></li>
				<li><a href="#"><i class="icon-briefcase icon-white"></i>Dados
						da Empresa</a></li>
				<li><a href="#"><i class="icon-wrench icon-white"></i>Configurações</a>
				</li>



			</ul>
		</div>
	</div>

	<div class="content" style="min-height: 1036px;">
		<div >
			<a href="javascript:void(0);"
				class="btn pull-left toggle-sidebar hidden-desktop"> <i
				class="icon-align-justify"></i></a> 

		</div>
		
		<!--/.navbar -->

	</div>
</div><!-- /.frame -->