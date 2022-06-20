//package com.cydeo.test.day13_configuration_reader;
//
//import static com.sun.tools.javac.code.Scope.ScopeImpl.sentinel;
//
//public class basics {
//        basics instance;
//        String stateVariable;
//        basics(String theVar)
//        {
//            stateVariable = theVar;
//        }
//        void main(String[] argc)
//        {
//            final String theValue = "sharp objects";
//            basics instance = getInstance(theValue);
//           // theValue = "no sharp objects";
//            instance.run();
//        }
//        basics getInstance(String theValue)
//        {
//            if (sentinel == null)
//                instance = new basics(theValue);
//        }
//        void run()
//        {
//            System.println("Running with" + stateVariable);
//        }
//    }
//}
