function guardar(){
    console.log("ejecutando funcion guardar");

    let ortopedic = {
        id: +$("#id").val(),
        brand: $("#brand").val(),
        year: +$("#year").val(),
        name: $("#name").val(),
        description: $("#description").val(),
        categoryId: +$("#categoryId").val()
    }; 

    console.log(ortopedic);

    $.ajax({
        url: "localhost:8080/api/Ortopedic/save",
        type: 'POST',
        dataType: 'json',
        headers: {
            "Content-Type": "application/json"
        },
        data: JSON.stringify(ortopedic),
        statusCode:{
            201:function(){
                alert('Se ha registrado la orthesis');
            }
        },
    });
}