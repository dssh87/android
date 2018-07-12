var express = require("express");

var app = express();

app.use(express.static('public'));

app.get("/s1", (req, res, next) =>{

    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "X-Requested-With");
    res.json({name:"홍길동", age:18, city:"Seoul"});

});

app.listen(3000, ()=> {
    console.log("3000 server run...")
});