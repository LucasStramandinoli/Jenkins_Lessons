package org.foo;

class Calculator{
  int num1
  int num2
  def script

  Calculator(script){
    this.script = script
  }

  void printOutCalc(){
    script.echo "total: ${num1}+${num2}"
  }
}
