$("#btnCheck").find(".CommonButtonImg").attr("src", "/uz/uza/image/UZ__CommonButton_Exe.png");
var callBackHandler = Uz._LoadInOrder.prototype.requestSequenceCallbackHandler;
Uz._LoadInOrder.prototype.requestSequenceCallbackHandler = function(eventName){
  callBackHandler.call(this,eventName);
  if(eventName === "btnshinsakekkakanryooutput_onClick_btnRyooutputBoffer"){
      $(document).on("click", ".ui-dialog-buttonset button", function(event) {
            var $span = $(event.target);
            if ($span.text() === "はい") {
                $("#hiddenbtnshinsakekkakanryooutput").click();
            }
        });
    }
}