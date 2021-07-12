package edu.asu.cse205.project4;

//**************************************************************************************************************
// CLASS: SubOperator
//
//
//
// COURSE AND PROJECT INFO
// CSE 205 Object Oriented Programming and Data Structure, Spring 2021
// Project Number: 4
// TEAM: KK
//
// AUTHOR
// Shawn Chen, schen337, schen337@asu.edu
// Timothy Cash, tjcash, tjcash@asu.edu
// Christian J Gonzalez Vargas, cjgonz21, cjgonz21@asu.edu
//
//**************************************************************************************************

/**
 * Represents the subtraction operator which is a specific type of binary operator.
 */
public class SubOperator extends BinaryOperator {
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() - pRhsOperand.getValue());
    }

    @Override
    int precedence() {
        return 2;
    }

    @Override
    int stackPrecedence() {
        return 2;
    }
}