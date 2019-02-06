grammar Calculator;
@header{
    import java.util.Map;
    import java.util.HashMap;
    import java.util.Scanner;
    }
@members{ 
    public static Map<String, Double> variables = new HashMap<String, Double>(); 
    public static Scanner in = new Scanner(System.in);
    }

comment:   LINE_COMMENT| BLOCK_COMMENT
;

exprList: topExpr ( ';' topExpr)* ';'? ;

topExpr:
    | boolExpr { if($boolExpr.s.equals("v")){}
                 else
                   System.out.println("result: "+ Integer.toString($boolExpr.b?1:0)); }
    | expr { if($expr.s.equals("v")){} 
             else 
                System.out.println("result: "+ Double.toString($expr.i));}
;

varDef returns[double d]: 
        ID '=' expr {variables.put($ID.text, $expr.i); $d=$expr.i;}
    |   ID '=' boolExpr {variables.put($ID.text, $boolExpr.b?1.0:0.0); $d=$boolExpr.b?1.0:0.0;}

;

boolExpr returns [boolean b, String s=""]:
      el=expr op='||' er=expr { $b=($el.i!=0 || $er.i!=0); }
    | el=expr op='&&' er=expr { $b=($el.i!=0 && $er.i!=0); } 
    | '!'boolExpr {$b=!$boolExpr.b;}
    | el=expr op='>=' er=expr { $b=($el.i>=$er.i); }
    | el=expr op='<=' er=expr { $b=($el.i<=$er.i); }
    | el=expr op='>' er=expr { $b=($el.i>$er.i); }
    | el=expr op='<' er=expr { $b=($el.i<$er.i); }
    | el=expr op='==' er=expr { $b=($el.i==$er.i); }
;

expr returns [double i, String s=""]:
    | '('expr')'    {$i=$expr.i;}
    | 'print('expr')' {System.out.println($expr.i);}
    | 'sqrt('expr')' { $i=Math.sqrt($expr.i);}
    | 'read()'       { $i = in.nextDouble();
                       in.close();}
    | ID'++' { if(variables.get($ID.text)!=null){
                 $i=variables.get($ID.text);
                 variables.put($ID.text,$i+1);
                 }
               else
                 $i=0;   
             }
    | ID'--' { if(variables.get($ID.text)!=null){
                 $i=variables.get($ID.text);
                 variables.put($ID.text,$i-1);
                 }
               else
                 $i=0;   
             }
    | '++'ID { if(variables.get($ID.text)!=null){
                 $i=variables.get($ID.text)+1;
                 variables.put($ID.text,$i);
                 }
               else
                 $i=0;   
             }
    |  '--'ID     { if(variables.get($ID.text)!=null){
                        $i=variables.get($ID.text)-1;
                        variables.put($ID.text,$i);
                        }
                    else
                        $i=0;   
                    }
    | varDef  {$i=$varDef.d;$s="v";}
    | INT                    { $i=Double.parseDouble($INT.text); }
    | DOUBLE                 { $i=Double.parseDouble($DOUBLE.text); }
    | ID                     { $i= (variables.get($ID.text)!=null)?variables.get($ID.text) :0 ; }
    | '!'expr {$i=($expr.i==0)?1:0;}
    | el=expr op=('*'|'/') er=expr { if($op.text.equals("*"))
                                        $i=$el.i*$er.i;
                                     else{
                                        if($er.i==0)
                                            System.out.println("Divide by zero error");
                                        else
                                            $i=$el.i/$er.i; }
                                     }
    | el=expr op=('+'|'-') er=expr { $i=($op.text.equals("+"))?$el.i+$er.i:$el.i-$er.i;}
    | 's(' ex=expr ')'       { $i= Math.sin($ex.i);}  
    | 'c(' ex=expr ')'       { $i= Math.cos($ex.i);}     
    | 'l(' ex=expr ')'       { $i= Math.log($ex.i);}    
    | 'e(' ex=expr ')'       { $i= Math.exp($ex.i);}                  
    | el=expr op='^' er=expr { $i=Math.pow($el.i,$er.i); }
    ;

VAR: 'var'; // keyword
LINE_COMMENT: '#' ~( '\r' | '\n' )* -> channel(HIDDEN);
BLOCK_COMMENT: '/*' .* '*/' -> channel(HIDDEN);
ID: [_A-Za-z]+;
INT: [0-9]+ ;
DOUBLE:[0-9]+'.'[0-9]+;
WS : [ \t\r\n]+ -> skip ;