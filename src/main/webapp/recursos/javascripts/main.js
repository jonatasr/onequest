

$(document).ready(function(){
	$("#pesquisa_componentes").hide(); 
	$("#add_questao").hide(); 

        $('.carousel').carousel({
          interval: 4000
        });
       
        $('#btn_criar_pesquisa').click(function(){
        	$("#add_questao").show(); 
        });
        
        $('#add_questao').click(function(event){
        	 event.preventDefault();
        	var url = $("#pesquisa_titulo").data("action");
            
      	  $.ajax({
            	url: url,
            	type: "POST",
            	success: function(object) {
            	
            		$("#pesquisa_componentes").show();   
            		$("#questao_num").text(object);
            	}
            });
        });
        
       
        
    });