grammar Calculator;
@header{
    import java.util.Map;
    import java.util.HashMap;
    }
@members{ 
    public static Map<String, Double> variables = new HashMap<String, Double>(); 
    }

comment:   LINE_COMMENT| BLOCK_COMMENT
;

exprList: topExpr ( ';' topExpr)* ';'? ;

topExpr:
    | boolExpr { System.out.println("result: "+ Integer.toString($boolExpr.b?1:0)); }
    | expr { System.out.println("result: "+ Double.toString($expr.i));}
;

varDef: 
        ID '=' expr {variables.put($ID.text, $expr.i);}
    |   ID '=' boolExpr {variables.put($ID.text, $boolExpr.b?1.0:0.0);}

;

boolExpr returns [boolean b]:
      el=expr op='||' er=expr { $b=($el.i!=0 || $er.i!=0); }
    | el=expr op='&&' er=expr { $b=($el.i!=0 && $er.i!=0); } 
    | '!'boolExpr {$b=!$boolExpr.b;}
    | el=expr op='>=' er=expr { $b=($el.i>=$er.i); }
    | el=expr op='<=' er=expr { $b=($el.i<=$er.i); }
    | el=expr op='>' er=expr { $b=($el.i>$er.i); }
    | el=expr op='<' er=expr { $b=($el.i<$er.i); }
    | el=expr op='==' er=expr { $b=($el.i==$er.i); }
;

expr returns [double i]:
    | varDef  {$i=1;}
    | '!'expr {$i=($expr.i==0)?1:0;}
    | el=expr op='*' er=expr { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr { $i=$el.i-$er.i; }
    | INT                    { $i=Double.parseDouble($INT.text); }
    | DOUBLE                 { $i=Double.parseDouble($DOUBLE.text); }
    | ID                     { $i= (variables.get($ID.text)!=null)?variables.get($ID.text) :0 ; }
    | 's(' ex=expr ')'       { $i= Math.sin($ex.i);}  
    | 'c(' ex=expr ')'       { $i= Math.cos($ex.i);}     
    | 'l(' ex=expr ')'       { $i= Math.log($ex.i);}    
    | 'e(' ex=expr ')'       { $i= Math.exp($ex.i);}                  
    | el=expr op='^' er=expr { $i=Math.pow($er.i,$el.i); }
    | expr'++' {$i=$expr.i+1;}
    | expr'--' {$i=$expr.i-1;}
    ;

VAR: 'var'; // keyword
LINE_COMMENT: '#' ~( '\r' | '\n' )* -> channel(HIDDEN);
BLOCK_COMMENT: '/*' .* '*/' -> channel(HIDDEN);
ID: [_A-Za-z]+;
INT: [0-9]+ ;
DOUBLE:[0-9]+'.'[0-9]+;
WS : [ \t\r\n]+ -> skip ;