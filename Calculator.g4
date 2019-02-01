grammar Calculator;
@header{
    import java.util.Map;
    import java.util.HashMap;
    }
@members{ 
    public static Map<String, Integer> variables = new HashMap<String, Integer>(); 
    }

comment:   LINE_COMMENT| BLOCK_COMMENT
;

exprList: topExpr ( ';' topExpr)* ';'? ;

topExpr: expr
    { System.out.println("result: "+ Integer.toString($expr.i));}
;

varDef: VAR ID '=' expr
    {
    variables.put($ID.text, $expr.i);
    }
;

expr returns [int i]:
      el=expr op='*' er=expr { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr { $i=$el.i-$er.i; }
    | INT                    { $i=Integer.parseInt($INT.text);}
    | ID                     { $i= (variables.get($ID.text)!=null)?variables.get($ID.text) :0;}
    | varDef
    | '('expr')'
    ;

VAR: 'var'; // keyword
LINE_COMMENT: '#' ~( '\r' | '\n' )* -> channel(HIDDEN);
BLOCK_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
ID: [_A-Za-z]+;
INT: [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;