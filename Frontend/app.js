const button = document.getElementById("absentBtn");

absentBtn.addEventListener("click",async()=>{
    const teacherName=document.getElementById("teacherName").value;

    const response=await fetch("http://localhost:8080/absent",
        {
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify({
                name:teacherName
 })
});

const data=await response.text();
document.getElementById("output").innerText=data;
});