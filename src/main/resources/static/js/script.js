document.addEventListener("DOMContentLoaded", function() {
    let close_btn = document.querySelector("#close_btn");
    let adra_globe = document.querySelector("#adra_globe");
    let sidebar = document.querySelector(".sidebar");

    close_btn.onclick = function() {
        sidebar.classList.toggle("active");
    };

    adra_globe.onclick = function() {
            sidebar.classList.toggle("active");
    };
});