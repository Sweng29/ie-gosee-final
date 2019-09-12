jQuery(document).ready(function () {

// This function will be called on click event.


    jQuery.fn.equalHeights = function () {
        var max_height = 0;
        jQuery(this).each(function () {
            max_height = Math.max(jQuery(this).height(), max_height);
        });
        jQuery(this).each(function () {
            jQuery(this).height(max_height);
        });
    };


    make = [];

    model = [];

    new_used = [];

    year = [];

    fuel_type = [];

    transmission = [];

    colour = [];

    doors = [];

    locations = [];

    sale_wanted = [];

    milage = [];

    price_to;

    price_from;

    year_to;

    year_from;

    milage_to;

    milage_from;


    jQuery(document).on('click', '.filter_select input[type="checkbox"]', function (e) {

        //jQuery(this).hide();

        //jQuery(this).find('checkbox').hide();
        //jQuery(this).parent().hide();

        //initialize all the variables to be used as an empty array.
        //jQuery('.all_prod').html("");
        year_to = jQuery('#year_to').val();
        year_from = jQuery('#year_from').val();
        price_to = jQuery('#price_to').val();
        price_from = jQuery('#price_from').val();
        milage_to = jQuery('#milage_to').val();
        milage_from = jQuery('#milage_from').val();
        car_feat = localStorage.getItem('car_feature');
        car_featurs = car_feat;
        make = [];

        model = [];

        new_used = [];

        year = [];

        fuel_type = [];

        transmission = [];

        colour = [];

        doors = [];

        locations = [];

        sale_wanted = [];

        milage = [];


        //loop through all the separated filter's checked check boxes, take the taxonomy id and push it into empty array

        // Make filters  jQuery


        jQuery(".make input:checked").each(function () {
            var make_id = jQuery(this).attr('name');
            make.push(make_id);
        });

        jQuery(".save-click").click(function () {
            console.log(saved_data);
            var data = {
                'filter': 2,
                'search_data': saved_data,
            };
            jQuery.post(notify_url, data, function (data) {
                console.log(data);
            });
        });


        // Model filters  jQuery filter

        jQuery(".model input:checked").each(function () {
            var model_id = jQuery(this).attr('name');
            model.push(model_id);
        });


        // New used  jQuery  filter

        jQuery(".new_used input:checked").each(function () {
            var newused_id = jQuery(this).attr('name');
            new_used.push(newused_id);
        });

        // Year jQuery filter

        // jQuery(".year input:checked").each(function(){
        //   var year_id=jQuery(this).attr('name');
        //   year.push(year_id);
        // });

        // Milage jQuery filter

        //  jQuery(".milage input:checked").each(function(){
        //   var milage_id =jQuery(this).attr('name');
        //   milage.push(milage_id);
        // });

        // Fuel_type jQuery filter

        jQuery(".fuel_type input:checked").each(function () {
            var fuel_type_id = jQuery(this).attr('name');
            fuel_type.push(fuel_type_id);
        });

        // Transmission jQuery filter


        jQuery(".transmission input:checked").each(function () {
            var transmission_id = jQuery(this).attr('name');
            transmission.push(transmission_id);
        });


        // Colour jQuery filter

        jQuery(".colour input:checked").each(function () {
            var colour_id = jQuery(this).attr('name');
            colour.push(colour_id);
        });

        // Doors jQuery filter

        jQuery(".doors input:checked").each(function () {
            var doors_id = jQuery(this).attr('name');
            doors.push(doors_id);
        });

        // Locations jQuery filter

        jQuery(".locations input:checked").each(function () {
            var locations_id = jQuery(this).attr('name');
            locations.push(locations_id);
        });

        // Sale Wanted jQuery filter

        jQuery(".sale_wanted input:checked").each(function () {
            var sale_wanted_id = jQuery(this).attr('name');
            sale_wanted.push(sale_wanted_id);
        });


        ajax_request();

    });

    /*jQuery("#dealers a").click(function(){

     localStorage.setItem('type',jQuery(this).attr('data-dealer'));

     car_feat = localStorage.getItem('car_feature');
     dealer_type = localStorage.getItem('type');
     //alert(dealer_type);
     //car_featurs = car_feat;




     ajax_request();
    });*/

    jQuery(document).on('click', '#search_btn', function (e) {
        e.preventDefault();
        var search_title = jQuery('#search_text').val();
        if (search_title == '' || search_title == null) {
            alert('Please enter search  title');
            //return false;
        } else {

            search_title = search_title;
            var data = {
                'filter': 1,
                'search_title': search_title

            };


            //saved_data = data;


            //Ajax url
            //var url="<?php bloginfo('url'); ?>/ajax";
            jQuery.get(url, data, function (data) {

                //alert(data);
                jQuery("#container_listing").load(" #container_listing");
                jQuery("#container_listing").html('');
                jQuery("#container_listing").html(data);
                jQuery(".owl-carousel").each(function () {
                    jQuery(this).owlCarousel({
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

                jQuery('.owl-prev').text('');
                jQuery('.owl-prev').text('<');

                jQuery('.owl-next').text('');
                jQuery('.owl-next').text('>');


                //jQuery('info-vehichle')


                jQuery('#container_listing .info-vehichle').equalHeights();


                //jQuery('.all_prod').append(data);
            });


        }


    });

});

function ajax_request() {


    var data = {
        'filter': 1,
        'make': make,
        'model': model,
        'new_used': new_used,
        'year_to': year_to,
        'year_from': year_from,
        'milage': milage,
        'fuel_type': fuel_type,
        'transmission': transmission,
        'colour': colour,
        'doors': doors,
        'locations': locations,
        'sale_wanted': sale_wanted,
        'term_id': term_id,
        //'cart_feature' : car_feat,


        'price_to': price_to,
        'price_from': price_from,
        'mileage_to': milage_to,
        'mileage_from': milage_from
    };


    saved_data = data;


    //Ajax url
    //var url="<?php bloginfo('url'); ?>/ajax";
    jQuery.get(url, data, function (data) {

        jQuery("#container_listing").html('');
        jQuery("#container_listing").html(data);
        jQuery(".owl-carousel").each(function () {
            jQuery(this).owlCarousel({
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

        jQuery('.owl-prev').text('');
        jQuery('.owl-prev').text('<');

        jQuery('.owl-next').text('');
        jQuery('.owl-next').text('>');

        //jQuery('.all_prod').append(data);

        jQuery('#container_listing .info-vehichle').equalHeights();
    });

}

