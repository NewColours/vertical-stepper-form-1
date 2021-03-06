package ernestoyaquello.com.verticalstepperform.interfaces;

import android.view.View;

public interface VerticalStepperForm {

    /**
     * The content of the layout of the corresponding step must be generated here. The system will
     * automatically call this method for every step
     * @param stepNumber the number of the step
     * @return The view that will be automatically added as the content of the step
     */
    View createStepContentView(int stepNumber);

    /**
     * This method will be called every time a certain step is open
     * @param stepNumber the number of the step
     */
    void onStepOpening(int stepNumber);

    /**
     * This method will be called when the user press the confirmation button
     */
    void sendData();

    /**
     * This method will be called when the button for a step is clicked.
     * This method is not called for the final 'confirm data' step.
     *
     * Contract: Although this method does not return a value, if the validation mode
     *    is next_press, you should change the validation state of the current step
     *    within this callback
     *
     * @param fromStepNumber the number of the step we are leaving; Uses a zero-based index
     * @param isCurrentStepValid true if the step is currently reporting as valid
     */
    void onClickNextStep(int fromStepNumber, boolean isCurrentStepValid);

    /**
     * @param inflatedView the next step view which is already attached to its parent
     * @param stepNumber the step this view was inflated for
     */
    void onNextStepViewInflated(View inflatedView, int stepNumber);

}
