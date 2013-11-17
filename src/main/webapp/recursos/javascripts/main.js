

$(document).ready(function(){
        $('.carousel').carousel({
          interval: 4000
        });
       
        $('#btn_criar_pesquisa').click(function(){
        	
        	var url = "<c:url value="/pesquisa/salvar_componentes"/>"
    		$("#pesquisa_componentes").load(url);
        	alert('teste');
        });
        
    });