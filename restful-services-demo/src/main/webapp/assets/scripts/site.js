var btn = document.getElementById("btnAllProducts");
btn.onclick=()=>{
	
/**
 * fetch() returns promise object
 */	
var url='api/products';
var options={
		method: 'GET',
		headers:{
			'Accept':'application/json'
		}
}	;

fetch(url,options)
.then(resp=>resp.json())
	.then(data=>display(data))
	.catch(err=>console.log(err));
};

function display(data){
	var list=data.map(p=>'<li>'+p.description+'</li>').join('');
	document.getElementById("productlist").innerHTML=list;
}
