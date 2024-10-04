package demo221403;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UIConsoleOutput implements OutputBoundary{

    PrintWriter stdout = null;


    public UIConsoleOutput(){
        stdout = new PrintWriter(new BufferedWriter
      (new OutputStreamWriter(System.out)), true);
    }

    public void showError(ResponseError resError){

        errr(resError);
    }

    private void errr(ResponseError resError){
        stdout.println(resError.content);
    }

    @Override
    public void output(ResponseData reqData) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'output'");
    }

  }