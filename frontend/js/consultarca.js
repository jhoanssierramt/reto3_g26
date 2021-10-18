function consultarca(){
    $.ajax({
        url: "localhost:8080/api/Category/all",
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
                    <th>NAME</th>
                    <th>DESCRIPTION</th>
                    <th>ORTOPEDICS</th>
                    <th>ACCIONES</th>
                  </tr>`;
                  
    
    for (var i=0; i < items.length; i++) {
        tabla +=`<tr>
                   <td>${items[i].id}</td>
                   <td>${items[i].name}</td>
                   <td>${items[i].description}</td>
                   <td>${items[i].ortopedics}</td>
                   <td>
                        <button onclick="eliminarca(${items[i].id})">Eliminar</button>
                        <a href="detalleca.html?id=${items[i].id}" disabled>Editar</a>
                   </td> 
                </tr>`;
    }
    tabla +=`</table>`;

    $("#tabla").html(tabla);
}