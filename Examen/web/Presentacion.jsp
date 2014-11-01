<%-- 
    Document   : Presentacion.jsp
    Created on : 31-oct-2014, 20:19:56
    Author     : T107
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            $(document).ready(functio){
                $("#guardar-cliente")Function()
               $ajax{
                   url:'guardar-cliente '
                   method:'push'
                   data:{
                       nombre:$("#nombre").val()
                       calificacion:$("#calificacion").val()
                   },
                   success:function(resultado){
                       $("#guardar-cliente").html(resultado)
                      
                   
                  ) };
              ) };
            )};

            
            
            
            
            
            
            
            
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--2.-titulo resulatado calificaciones -->
        <h1>Resulatdo Calificaciones</h1>
        
    </body>
</html>
