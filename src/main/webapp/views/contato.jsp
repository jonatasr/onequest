<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  

  
  <div class="container"> 
  <div class="row">
  <div class="well span7">
 
    <form>
            <fieldset>
                
                <div class="input-prepend">
                  <div class="controls">
                    <span class="add-on"><i class="icon-user"></i></span>
                    <input id="textinput" name="textinput" type="text" placeholder="Nome" class="input-xlarge">
                    <!--<input type="text" id="name" name="name" class="input-block-level" placeholder="Name">-->
                    
                  </div>
                </div>

                <div class="input-prepend">
                  <div class="controls">
                    <span class="add-on"><i class="icon-envelope"></i></span>
                    <input id="textinput" name="textinput" type="text" placeholder="E-mail" class="input-xlarge">
                    <!--<input type="text" id="email" name="email" class="input-block-level" placeholder="Email">-->
                  </div>
                </div>
                <textarea class="span5" rows="5" id="description" name="description" class="input-block-level" placeholder="Description">
                </textarea>
          


              <div class="control-group">
                    <!-- Botão cadastrar-->
                    <div class="controls">
                      <button type="submit" class="btn btn-info pull-right">Enviar</button>
                    </div>  
              </div>


                
            </fieldset>
        </form>
  </div>
   </div> 
</div>
