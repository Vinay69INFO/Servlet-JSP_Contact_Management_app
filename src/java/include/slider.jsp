<%@taglib uri="http://www.springframework.org/tags" prefix="u" %>

<!-- Start Image Slider -->
        <div id="carouselExampleIndecator" class="carousel slide" data-ride="carousel" data-interval="7000">

            <div class="carousel-inner" role="listbox">
                <!-- Slide 1-->
                <div class="carousel-item active"
                    style="background-image:linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.5)),url('./static/images/slide_1.jpg');">
                    <div class="carousel-caption text-left">
                        <h1>Welcome TO Digital Marketing</h1>
                        <p>Transform Your business Through with Digital Marketing</p>
                        <a class="btn btn-outline-light btn-lg" href="#course">Get Started</a>
                    </div>
                </div>

                <!-- Slide 2-->
                <div class="carousel-item "
                    style="background-image:linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.5)), url('./static/images/slide_2.jpg');">
                    <div class="carousel-caption text-left">
                        <h1>Communication Support</h1>
                        <p>We are Here to Support Your Business</p>
                        <a class="btn btn-outline-light btn-lg" href="#course">Get Started</a>
                    </div>
                </div>

                <!-- Slide 3-->
                <div class="carousel-item "
                    style="background-image:linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.5)), url('./static/images/slide_3.jpg');">
                    <div class="carousel-caption text-left">
                        <h1>Digital World</h1>
                        <p>Digitalization of the Business is the New Trend of Marketing</p>
                        <a class="btn btn-outline-light btn-lg" href="#course">Get Started</a>
                    </div>
                </div>
            </div> <!-- Slide Innner section End-->

            <!-- Carousel indecator section -->
            <ul class="carousel-indicators">
                <li data-target="#carouselExampleIndecator" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndecator" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndecator" data-slide-to="2"></li>
            </ul>

            <!-- Carousel prev & next slide icon section 
            <a class="carousel-control-prev" href="#carouselExampleIndecator" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndecator" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
            </a>
            -->
        </div>
        <!-- End Image Slider -->