package com.hades.example.java.refactoring.before.c8._c8_6_duplicate_observed_data;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class IntervalWindow extends Frame {
    TextField startField;
    TextField endField;
    TextField lengthField;

    class SymFocus extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            super.focusGained(e);
        }

        @Override
        public void focusLost(FocusEvent e) {
            super.focusLost(e);
            Object object = e.getSource();
            if (object == startField) {
                StartField_FocusLost(e);
            } else if (object == endField) {
                EndField_FocusLost(e);
            } else if (object == lengthField) {
                LengthField_FocusLost(e);
            }
        }

        void StartField_FocusLost(FocusEvent event) {
            calculateLength();
        }

        void EndField_FocusLost(FocusEvent event) {
            calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event) {
            calculateEnd();
        }

        private void calculateLength() {
            try {
                int start = Integer.parseInt(startField.getText());
                int end = Integer.parseInt(endField.getText());
                int length = end - start;
                lengthField.setText(String.valueOf(length));
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Unexcepted number format error");
            }
        }

        private void calculateEnd() {
            try {
                int start = Integer.parseInt(startField.getText());
                int length = Integer.parseInt(lengthField.getText());
                int end = start + length;
                endField.setText(String.valueOf(end));
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Unexcepted number format error");
            }
        }
    }
}
