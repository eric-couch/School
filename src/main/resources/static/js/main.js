function postData(url, data) {
    return fetch(url, {
        body: JSON.stringify(data),
        cache: "no-cache",
        credentials: "same-origin",
        headers: {
            "user-agent": "Mozilla/4.0 MDN Example",
            "content-type": "application/json"
        },
        method: "POST",
        mode: "same-origin",
        redirect: "follow",
        referrer: "no-referrer"
    }).then(reponse => response.json());
}

function getData(url, data) {
    // Default options are marked with *
    return fetch(url, {
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, same-origin, *omit
        headers: {
            "user-agent": "Mozilla/4.0 MDN Example",
            "content-type": "application/json"
        },
        method: "GET", // *GET, POST, PUT, DELETE, etc.
        mode: "same-origin", // no-cors, cors, *same-origin
        redirect: "follow", // manual, *follow, error
        referrer: "no-referrer" // *client, no-referrer
    }).then(response => response.json()); // parses response to JSON
}

document.addEventListener("DOMContentLoaded", function() {
    let courses = getData("/courses").then(data => updateCourses(data));
})

function updateCourses(d) {
        d.forEach(function(course) {
            const { id, name, description, steps } = course;
            let mainDiv = document.getElementById("main");
            mainDiv.innerHTML += "name: " + name + "<br>description: " + description + "<hr>"
        })

}