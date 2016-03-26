jQuery(document).ready(function($){
	var $form_modal = $('.cd-user-modal'),
		$form_login = $form_modal.find('#cd-login'),
		$form_signup = $form_modal.find('#cd-signup'),
		$form_modal_tab = $('.cd-switcher'),
		$tab_login = $form_modal_tab.children('li').eq(0).children('a'),
		$tab_signup = $form_modal_tab.children('li').eq(1).children('a'),
		$main_nav = $('.main_nav'),
		$login=$('#login');
		$me = $('#personal');
		$register = $('#register');

	//弹出层
	$main_nav.on('click', function(event){

		if( $(event.target).is($main_nav) ) {
			// on mobile open the submenu
			$form_modal.addClass('is-visible');
		} else {
			//show modal layer
			$form_modal.addClass('is-visible');
			//show the selected form
			( $(event.target).is('.cd-signup') ) ? signup_selected() : login_selected();
		}

	});
	//登入函数
	$login.on('click',function(event){
		if( $(event.target).is($login) ) {
			var jsonStr = {"userName": $(":input#signin-username").val(), "passWd": $(":input#signin-password").val()};
			var user = JSON.stringify(jsonStr);
			$.ajax({
				type: "POST",
				url: "/login.do",
				contentType: 'application/json;charset=UTF-8',
				data: user,
				datatype: 'json',
				success: function (usr) {
					$form_modal.removeClass("is-visible");
					$me.html(usr['userName'])
				},
				error: function () {
				}
			});
		}
	});
//注册函数
	$register.on('click',function(event){
		if( $(event.target).is($register) ) {
			var jsonStr = {"userName": $(":input#signup-username").val(),
				"passWd": $(":input#signup-password").val(),
				"mail":$(":input#signup-email").val};
			var user = JSON.stringify(jsonStr);
			$.ajax({
				type: "POST",
				url: "/addUser.do",
				data: user,
				contentType: 'application/json;charset=UTF-8',
				datatype: 'text',
				success: function (data) {
					if(data == "OK"){
						$form_modal.removeClass("is-visible");
						alert("注册成功");
					}else {
						alert("注册失败");
					}
				},
				error: function () {
				}
			});
		}
	});


	$('.cd-user-modal').on('click', function(event){
		if( $(event.target).is($form_modal) || $(event.target).is('.cd-close-form') ) {
			$form_modal.removeClass('is-visible');
		}	
	});
	$(document).keyup(function(event){
    	if(event.which=='27'){
    		$form_modal.removeClass('is-visible');
	    }
    });


	$form_modal_tab.on('click', function(event) {
		event.preventDefault();
		( $(event.target).is( $tab_login ) ) ? login_selected() : signup_selected();
	});

	function login_selected(){
		$form_login.addClass('is-selected');
		$form_signup.removeClass('is-selected');
		$tab_login.addClass('selected');
		$tab_signup.removeClass('selected');
	}

	function signup_selected(){
		$form_login.removeClass('is-selected');
		$form_signup.addClass('is-selected');
		$tab_login.removeClass('selected');
		$tab_signup.addClass('selected');
	}

});


jQuery.fn.putCursorAtEnd = function() {
	return this.each(function() {
    	// If this function exists...
    	if (this.setSelectionRange) {
      		// ... then use it (Doesn't work in IE)
      		// Double the length because Opera is inconsistent about whether a carriage return is one character or two. Sigh.
      		var len = $(this).val().length * 2;
      		this.setSelectionRange(len, len);
    	} else {
    		// ... otherwise replace the contents with itself
    		// (Doesn't work in Google Chrome)
      		$(this).val($(this).val());
    	}
	});
};