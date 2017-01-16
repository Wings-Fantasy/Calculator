package calculation;
import database.CalculatorData;
public class Calculation {
	public int Calculation(CalculatorData sj) throws lengthException, ZeroException  {
		int numberA=sj.getNumberA();
		int numberB=sj.getNumberB();
		int number=0;
		String operationSymbol=sj.getOperationSymbol();
		if(operationSymbol.equals("+")) {
			if(numberA+numberB<99999999) {
				number=numberA+numberB;
				return number;
			}else{
				throw new lengthException("长度过大");
			}
		}
		else if(operationSymbol.equals("-")) {
			number=numberA-numberB;
			return number;
		}
		else if(operationSymbol.equals("X")) {
			if(numberA*numberB<99999999) {
				number=numberA*numberB;
				return number;
			}else{
				throw new lengthException("长度过大");
			}
		}
		else if(operationSymbol.equals("÷")) {
			if(numberB!=0) {
				number=numberA/numberB;
				return number;
			}else{
				throw new ZeroException("除数为0");
			}
		}
		return number;
	}
}