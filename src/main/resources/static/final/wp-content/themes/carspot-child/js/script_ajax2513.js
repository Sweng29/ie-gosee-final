/* Ajax functions */
jQuery.noConflict($);
jQuery(document).ready(function ($) {
    //onclick

    var $container = $('.grid');

    $("#loadMore").on('click', function (e) {
        //init
        var that = $(this);
        var page = $(this).data('page');
        var newPage = page + 1;
        var ajaxurl = that.data('url');
        //ajax call
        $.ajax({
            url: ajaxurl,
            type: 'post',
            data: {
                page: page,
                action: 'ajax_script_load_more'

            },
            error: function (response) {
                console.log(response);
            },
            success: function (response) {
                //check
                if (response == 0) {
                    $(".text-center").remove();

                    $('#ajax-content').after('<div class="text-center"><p>No more posts to load.</p></div>');
                    $('#loadMore').hide();
                } else {
                    that.data('page', newPage);
                    $(".text-center").remove();
                    $('#ajax-content').append(response);

                    $('.list a').each(function (i) {
                        var data_url = $(this).attr('data-url');
                        $(this).attr("href", "data_url");

                    });

                    setTimeout(function () {


                        $container.masonry({
                            // columnWidth: 100,

                            itemSelector: '.item',

                        });

                        $($container).masonry('reloadItems');
                        $($container).masonry('layout');

                    }, 500);

                    //$container.masonry('reloadItems');


                    // $('.item > a').removeAttr('href')
                    // initialize


                }
            }
        });
    });

    $("#post_format button").click(function () {

        var $container = $('.grid');
        var that = $(this);

        //$("#post_format img.img_eye").attr('src',img_old_url);

        $("#post_format button").removeClass('post_format_active');
        $(this).addClass('post_format_active');
        var post_format = that.data('value');
        //var img = that.find("img:nth-child(2)").attr('src',img_url);
        //alert(post_format);
        //alert(img_eye);
        var page = 1;
        var newPage = page + 1;

        $.ajax({
            url: ajaxurl,
            page: page,
            type: 'post',
            data: {
                post_format: post_format,
                action: 'ajax_script_load_more'

            },
            error: function (response) {
                console.log(response);
            },
            success: function (response) {
                //check
                if (response == 0) {
                    $(".text-center").remove();


                    $('#ajax-content').after('<div class="text-center"><p>No more posts to load.</p></div>');
                    $('#loadMore').hide();
                } else {
                    // $(".text-center").remove();

                    $('#ajax-content').html('');

                    $("#loadMore").data('page', newPage);

                    $('#ajax-content').append(response);
                    setTimeout(function () {

                        $container.masonry({
                            // columnWidth: 100,

                            itemSelector: '.item',

                        });

                        $($container).masonry('reloadItems');
                        $($container).masonry('layout');

                    }, 500);

                    //$container.masonry('reloadItems');


                    // $('.item > a').removeAttr('href')
                    // initialize


                }
            }
        });


    });


    $('#search_post').keypress(function () {
        $('#ajax-content').html('');
        var post_title = this.value;

        var $container = $('.grid');
        var that = $(this);
        $(this).addClass('post_format_active');
        var post_format = that.data('value');

        var page = 1;
        //var newPage = page + 1; 

        $.ajax({
            url: ajaxurl,
            type: 'post',
            page: page,
            data: {
                s: post_title,
                action: 'ajax_script_load_more'

            },
            error: function (response) {
                console.log(response);
            },
            success: function (response) {
                //check
                if (response == 0) {
                    $(".text-center").html('');
                    $(".text-center").remove();

                    $('#ajax-content').html('');
                    $('#ajax-content').after('<div class="text-center"><h3>You reached the end of the post!</h3><p>No more posts to load.</p></div>');
                    $('#loadMore').hide();
                } else {

                    $("#loadMore").data('page', page);
                    $('#ajax-content').html('');
                    $(".text-center").html('');
                    $('#ajax-content').append(response);


                    setTimeout(function () {


                        $container.masonry({
                            // columnWidth: 100,

                            itemSelector: '.item',

                        });

                        $($container).masonry('reloadItems');
                        $($container).masonry('layout');

                    }, 500);

                    //$container.masonry('reloadItems');


                    // $('.item > a').removeAttr('href')
                    // initialize


                }
            }
        });


    });

    $('body').on('click', '.single_page_popup', function (e) {
        //init
        e.preventdefault();
        var post_id = $(this).attr("post_id");
        var ajaxurl = $('#carspot_ajax_url').val();
        //alert("test");
        //alert(ajaxurl);


        var that = $(this);
        //ajax call
        $.ajax({
            url: ajaxurl,
            type: 'post',
            data: {
                post_id: post_id,
                action: 'single_page_template'

            },
            error: function (response) {
                console.log(response);
            },
            success: function (response) {
                //check
                $('.overlay-hub').css('display', 'block');
                $('.overlay').html(response);
                $('.overlay').css('display', 'block');

                $(".owl-carousel").each(function () {
                    $(this).owlCarousel({
                        loop: true,
                        margin: 10,
                        responsiveClass: true,
                        responsive: {
                            320: {
                                items: 1,
                                nav: true,
                                loop: false,
                                margin: 20
                            }
                        }

                    });
                });

                $('.owl-next').text('>');
                $('.owl-prev').text('<');

            }
        });
    });


    //find scroll position
    /*$(window).scroll(function() {
        //init
        var that = $('#loadMore');
        var page = $('#loadMore').data('page');
        var newPage = page + 1;
        var ajaxurl = $('#loadMore').data('url');
        //check
        if ($(window).scrollTop() == $(document).height() - $(window).height()) {
 
            //ajax call
            $.ajax({
                url: ajaxurl,
                type: 'post',
                data: {
                    page: page,
                    action: 'ajax_script_load_more'
                },
                error: function(response) {
                    console.log(response);
                },
                success: function(response) {
                    //check
                    if (response == 0) {
                        //check
                        if ($("#no-more").length == 0) {
                            $('#ajax-content').append('<div id="no-more" class="text-center"><h3>You reached the end of the line!</h3><p>No more posts to load.</p></div>');
                        }
                        $('#loadMore').hide();
                    } else {
                        $('#loadMore').data('page', newPage);
                        $('#ajax-content').append(response);
                    }
                }
            });
        }
    });
	
	*/

    $(document).on('click', '.close_btn', function () {

        $(".chat_box").toggle();
    });


});




