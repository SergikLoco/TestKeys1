package testpackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pack.MathClass;

public class TestClass {

    @BeforeMethod
    public void TestBefore(){
        System.out.println("start_test");
    }
    @DataProvider (name = "DataSum")
        public Object[][] createData1() {
            return new Object[][]{
                    {10, 20, 30},
                    {5, 5, 10},
                    {100, 100, 200},
        };
    }
    @DataProvider (name = "DataDif")
        public Object[][] createData2(){
            return new Object [][]{
                    {100,100,0},
                    {100,90,10},
                    {87,83,4},
                    {228,229,-1}
            };
        }
    @DataProvider (name = "DataMulti")
        public Object[][] createData3(){
            return new Object[][]{
                    {5,5,25},
                    {25,25,625}
        };
    }
    @DataProvider (name = "DataDiv")
        public Object[][] createData4(){
        return new Object[][]{
                {100,10,10},
                {125,25,5},
                {9,9,1},
                {-100,-10,10},
        };
    }

    @Test(dataProvider = "DataSum")
    public void Test_Sum_Two_Numbers(float param1, float param2, float param3){

        Assert.assertEquals(param3, MathClass.Sum(param1, param2));
        System.out.println("Error");
    }
    @AfterMethod
    public void Test2(){
        System.out.println("finish_test");
    }
    @Test (dataProvider = "DataDif")
    public void Test_Difference_Two_Number(float param1, float param2, float param3){
        Assert.assertEquals(param3, MathClass.Dif(param1,param2));
        System.out.println("Error");
    }
    @Test (dataProvider = "DataMulti")
    public void Test_Multiple_Two_Number(float param1, float param2, float param3){
        Assert.assertEquals(param3, MathClass.Multi(param1,param2));
        System.out.println("Error");
    }
    @Test (dataProvider = "DataDiv")
    public void Test_Divide_Two_Number(float param1, float param2, float param3){
        Assert.assertEquals(param3, MathClass.Div(param1,param2));
        System.out.println("Error");
    }

}
