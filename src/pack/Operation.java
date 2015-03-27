package pack;

public class Operation {
    public float Calc(float x, float y, int ch){
  float answer=0;
        switch(ch){
            case 1:{answer = MathClass.Sum(x,y);}
            break;
            case 2:{answer = MathClass.Dif(x,y);}
            break;
            case 3:{answer = MathClass.Multi(x,y);}
            break;
            case 4:{answer = MathClass.Div(x,y);}
            break;
            default:answer=0;
                    }
    return answer;}

}
