
package org.usfirst.frc.team2848.neuralnetwork;


public interface TransferFunction {

    public double calculate(double x);

    public double derivative(double x);

    public static class Sigmoid implements TransferFunction {

        @Override
        public double calculate(double x) {
            return 1 / (1 + Math.exp(-x));
        }

        @Override
        public double derivative(double x) {
            double expnegx = Math.exp(-x);
            return expnegx / Math.pow((1 + expnegx), 2);
        }

        @Override
        public String toString() {
            return "sig";
        }
    }

    public static class Step implements TransferFunction {

        @Override
        public double calculate(double x) {
            return x < 0 ? 0 : x;
        }

        @Override
        public double derivative(double x) {
            return 1.0;
        }

        @Override
        public String toString() {
            return "step";
        }
    }

    public static class HyperbolicTangent implements TransferFunction {

        @Override
        public double calculate(double x) {
            return Math.tanh(x);
        }

        @Override
        public double derivative(double x) {
            double tanhx = Math.tanh(x);
            return 1.0 - tanhx * tanhx;
        }

        @Override
        public String toString() {
            return "tanh";
        }
    }
}
