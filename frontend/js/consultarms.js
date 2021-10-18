function consultar(){
    $.ajax({
        url: "localhost:8080/api/Message/all",
        type: 'GET',
        dataType: 'json',
        success: function(respuesta){
            console.log(respuesta.items);
            mostrarRespuesta(respuesta.items);
        },
        error: function (xhr, status) {
            alert('ha sucedido un problema');
        }
    });
}

function mostrarRespuesta(items){
    var tabla = `<table border="1">
                  <tr>
                    <th>ID</th>
                    <th>MESSAGETEXT</th>
                    <th>ACCIONES</th>
                  </tr>`;
                  
    
    for (var i=0; i < items.length; i++) {
        tabla +=`<tr>
                   <td>${items[i].id}</td>
                   <td>${items[i].messagetext}</td>
                   <td>
                        <button onclick="eliminar(${items[i].id})">Eliminar</button>
                        <a href="detallems.html?id=${items[i].id}" disabled>Editar Mensaje</a>
                   </td> 
                </tr>`;
    }
    tabla +=`</table>`;

    $("#tabla").html(tabla);
}