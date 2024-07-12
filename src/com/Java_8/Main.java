package com.Java_8;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesigination() {
                return "Dancer";
            }
        };

        System.out.println(employee.getSalary());
    }
}
