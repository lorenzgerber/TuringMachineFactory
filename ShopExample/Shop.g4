grammar Shop;

shop	: item+ ;
item	: '(' ID '\t' PRICE '\t' NAME ')';

ID	: 'id' [0-9]+ ;
PRICE	: [1-9][0-9]* ;
NAME	: [A-Za-z ]+ ;
WS	: [\r\n]+ -> skip ;