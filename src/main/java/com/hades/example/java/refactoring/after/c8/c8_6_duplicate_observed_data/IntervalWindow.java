package com.hades.example.java.refactoring.after.c8.c8_6_duplicate_observed_data;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer {
    TextField startField;
    TextField endField;
    TextField lengthField;
    private Interval subject;

    public IntervalWindow() throws HeadlessException {
        subject = new Interval();
        subject.addObserver(this);
    }

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
            setEnd(endField.getText());
            calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event) {
            calculateEnd();
        }

        private void calculateLength() {
            try {
                int start = Integer.parseInt(getLength());
                int end = Integer.parseInt(getEnd());
                int length = end - start;
                setLength(String.valueOf(length));
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Unexcepted number format error");
            }
        }

        private void calculateEnd() {
            try {
                int start = Integer.parseInt(startField.getText());
                int length = Integer.parseInt(getLength());
                int end = start + length;
                setEnd(String.valueOf(end));
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Unexcepted number format error");
            }
        }
    }

    @Override
    public void update(Observable observable, Object o) {
        endField.setText(subject.getEnd());
        lengthField.setText(subject.getLength());
    }

    String getEnd() {
        return subject.getEnd();
    }

    void setEnd(String arg) {
        subject.setEnd(arg);
    }

    public void setLength(String args) {
        lengthField.setText(args);
    }

    String getLength() {
        return lengthField.getText();
    }
}