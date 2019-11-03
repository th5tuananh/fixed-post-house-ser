function submitform(){
        alert("Sending Json");
        var xhr = new XMLHttpRequest();
        xhr.open(form.method, form.action, true);
        xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');
        var j = {
            "first_name":"binchen",
            "last_name":"heris",
        };
        xhr.send(JSON.stringify(j));