package org.foo;

class Calculator{
  int num1
  int num2
  def script

  Calc(script){
    this.script = script
  }

  void printOutCalc(){
    script.echo "total: ${num1}+${num2}"
  }
}
