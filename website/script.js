
document.addEventListener("DOMContentLoaded", function () {
    const maxVerstappenElement = document.querySelector(".max-verstappen");

    maxVerstappenElement.addEventListener("mouseover", function () {
        maxVerstappenElement.style.color = "blue";
    });

    maxVerstappenElement.addEventListener("mouseout", function () {
        maxVerstappenElement.style.color = "";
    });

    maxVerstappenElement.addEventListener("click", function () {
        alert("GOAT btw");
    });
});
