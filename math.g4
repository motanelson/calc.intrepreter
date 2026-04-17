
grammar math;

expr: addExpr ;

addExpr
    : mulExpr (('+' | '-') mulExpr)*
    ;

mulExpr
    : atom (('*' | '/') atom)*
    ;

atom
    : NUMBER
    | '(' expr ')'
    ;

NUMBER: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;