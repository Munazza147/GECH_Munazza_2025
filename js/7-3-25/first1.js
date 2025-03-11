console.log("hello munazza ");

//console.log(document.getRootNode()); //it will give code of html in actual_dom
const document_root=document.getRootNode();
console.log(document_root.childNodes);
// o/p  ==== NodeList(2) [<!DOCTYPE html>, html]
console.log("html tags");
const html_tag= document_root.childNodes[1]; //it will show wntire code of html
console.log(html_tag);
console.log("html child nodes");
console.log(html_tag.childNodes); // NodeList [head]

console.log("html parant node");
console.log(html_tag.parentNode);
// console.log(html_tag.nextSibling);

console.log("Head tag");
const head_tag = html_tag.childNodes[0]
console.log(head_tag);

console.log("head tag child");
const head_child = head_tag.childNodes
console.log(head_child);

console.log("head tag children");
const head_children = head_tag.children
console.log(head_children);

console.log("object");



// const body_tag = html_tag.childNodes[2]
// console.log(body_tag);
// const body_tag2 = document.body;
// console.log(body_tag2);