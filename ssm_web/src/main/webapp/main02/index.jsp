<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <meta charset="utf-8"/>
    <title>数据后台管理</title>

    <link rel="stylesheet" href="css/layout.css" type="text/css" media="screen"/>
    <!--[if lt IE 9]>
    <link rel="stylesheet" href="../main02/css/ie.css" type="text/css" media="screen"/>
    <![endif]-->
    <script src="${pageContext.request.contextPath}/main02/js/jquery-1.5.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/main02/js/hideshow.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/main02/js/jquery.tablesorter.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/main02/js/jquery.equalHeight.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
                $(".tablesorter").tablesorter();
            }
        );
        $(document).ready(function () {

            //When page loads...
            $(".tab_content").hide(); //Hide all content
            $("ul.tabs li:first").addClass("active").show(); //Activate first tab
            $(".tab_content:first").show(); //Show first tab content

            //On Click Event
            $("ul.tabs li").click(function () {

                $("ul.tabs li").removeClass("active"); //Remove any "active" class
                $(this).addClass("active"); //Add "active" class to selected tab
                $(".tab_content").hide(); //Hide all tab content

                var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
                $(activeTab).fadeIn(); //Fade in the active ID content
                return false;
            });

        });
    </script>
    <script type="text/javascript">
        $(function () {
            $('.column').equalHeight();
        });
    </script>

</head>


<body>

<header id="header">
    <hgroup>
        <h1 class="site_title"><a href="index.jsp">Website Admin</a></h1>
        <h2 class="section_title">数据后台管理</h2>
        <div class="btn_view_site"><a href="#">返回主页</a></div>
    </hgroup>
</header> <!-- end of header bar -->

<section id="secondary_bar">
    <div class="user">
        <p>管理员 (<a href="#">3 信息</a>)</p>
        <!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
    </div>
    <div class="breadcrumbs_container">
        <article class="breadcrumbs"><a href="index.jsp">数据管理</a>
            <div class="breadcrumb_divider"></div>
            <a class="current">后台管理</a></article>
    </div>
</section><!-- end of secondary bar -->

<aside id="sidebar" class="column">
    <form class="quick_search">
        <input type="text" value="Quick Search" onfocus="if(!this._haschanged){this.value=''};this._haschanged=true;">
    </form>
    <hr/>
    <h3>内容</h3>
    <ul class="toggle">
        <li class="icn_new_article"><a href="#">新建内容</a></li>
        <li class="icn_edit_article"><a href="#">编辑内容</a></li>
        <li class="icn_categories"><a href="#">类表</a></li>
        <li class="icn_tags"><a href="#">标签</a></li>
    </ul>
    <h3>用户</h3>
    <ul class="toggle">
        <li class="icn_add_user"><a href="#">添加新用户</a></li>
        <li class="icn_view_users"><a href="#">用户视图</a></li>
        <li class="icn_profile"><a href="#">个人资料</a></li>
    </ul>
    <h3>媒体</h3>
    <ul class="toggle">
        <li class="icn_folder"><a href="#">文件管理</a></li>
        <li class="icn_photo"><a href="#">图片</a></li>
        <li class="icn_audio"><a href="#">音频</a></li>
        <li class="icn_video"><a href="#">视频</a></li>
    </ul>
    <h3>管理</h3>
    <ul class="toggle">
        <li class="icn_settings"><a href="#">选项</a></li>
        <li class="icn_security"><a href="#">安全</a></li>
        <li class="icn_jump_back"><a href="#">注销</a></li>
    </ul>

    <footer>
        <hr/>
        <p><strong>版权所有©2019 朱超斌&黄佳明</strong></p>
    </footer>
</aside><!-- end of sidebar -->

<section id="main" class="column">

    <h4 class="alert_info">欢迎使用???数据管理平台</h4>

    <article class="module width_full">
        <header><h3>统计</h3></header>
        <div class="module_content">
            <article class="stats_graph">
                <img src="" width="520" height="140" alt=""/>
            </article>

            <article class="stats_overview">
                <div class="overview_today">
                    <p class="overview_day">今天</p>
                    <p class="overview_count">1,000</p>
                    <p class="overview_type">点击</p>
                    <p class="overview_count">2,103</p>
                    <p class="overview_type">访客</p>
                </div>
                <div class="overview_previous">
                    <p class="overview_day">昨天</p>
                    <p class="overview_count">1,646</p>
                    <p class="overview_type">点击</p>
                    <p class="overview_count">2,054</p>
                    <p class="overview_type">访客</p>
                </div>
            </article>
            <div class="clear"></div>
        </div>
    </article><!-- end of stats article -->

    <article class="module width_3_quarter">
        <header><h3 class="tabs_involved">内容管理</h3>
            <ul class="tabs">
                <li><a href="#tab1">帖子</a></li>
                <li><a href="#tab2">评论</a></li>
            </ul>
        </header>

        <div class="tab_container">
            <div id="tab1" class="tab_content">
                <table class="tablesorter" cellspacing="0">
                    <thead>
                    <tr>
                        <th></th>
                        <th>条目名称</th>
                        <th>类别</th>
                        <th>创建日期</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>Lorem Ipsum Dolor Sit Amet</td>
                        <td>Articles</td>
                        <td>5th April 2019</td>
                        <td><input type="image" src="../main界面/images/icn_edit.png" title="Edit"><input type="image"
                                                                                                        src="../main界面/images/icn_trash.png"
                                                                                                        title="Trash"></td>
                    </tr>


                    </tbody>
                </table>
            </div><!-- end of #tab1 -->

            <div id="tab2" class="tab_content">
                <table class="tablesorter" cellspacing="0">
                    <thead>
                    <tr>
                        <th></th>
                        <th>评论</th>
                        <th>发布者</th>
                        <th>发布时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>Lorem Ipsum Dolor Sit Amet</td>
                        <td>Mark Corrigan</td>
                        <td>5th April 2019</td>
                        <td><input type="image" src="../main界面/images/icn_edit.png" title="Edit"><input type="image"
                                                                                                        src="../main界面/images/icn_trash.png"
                                                                                                        title="Trash"></td>
                    </tr>
                    </tbody>
                </table>

            </div><!-- end of #tab2 -->

        </div><!-- end of .tab_container -->

    </article><!-- end of content manager article -->

    <article class="module width_quarter">
        <header><h3>留言</h3></header>
        <div class="message_list">
            <div class="module_content">
                <div class="message"><p>尼玛的今天好热</p>
                    <p><strong>Admin</strong></p></div>
                <div class="message"><p>尼玛的今天好热</p>
                    <p><strong>Admin</strong></p></div>
                <div class="message"><p>尼玛的今天好热</p>
                    <p><strong>Admin</strong></p></div>
                <div class="message"><p>尼玛的今天好热</p>
                    <p><strong>Admin</strong></p></div>
                <div class="message"><p>尼玛的今天好热</p>
                    <p><strong>Admin</strong></p></div>
            </div>
        </div>
        <footer>
            <form class="post_message">
                <input type="text" value="Message"
                       onfocus="if(!this._haschanged){this.value=''};this._haschanged=true;">
                <input type="submit" class="btn_post_message" value=""/>
            </form>
        </footer>
    </article><!-- end of messages article -->

    <div class="clear"></div>

    <article class="module width_full">
        <header><h3>暂未完成</h3></header>
        <div class="module_content">
            <fieldset>
                <label>标题</label>
                <input type="text">
            </fieldset>
            <fieldset>
                <label>内容</label>
                <textarea rows="12"></textarea>
            </fieldset>
            <fieldset style="width:48%; float:left; margin-right: 3%;">
                <!-- to make two field float next to one another, adjust values accordingly -->
                <label>种类</label>
                <select style="width:92%;">
                    <option>投诉</option>
                    <option>建议</option>
                    <option>捐助</option>
                </select>
            </fieldset>
            <fieldset style="width:48%; float:left;">
                <!-- to make two field float next to one another, adjust values accordingly -->
                <label>小标题</label>
                <input type="text" style="width:92%;">
            </fieldset>
            <div class="clear"></div>
        </div>
        <footer>
            <div class="submit_link">
                <select>
                    <option>1111111111</option>
                    <option>2222222222</option>
                </select>
                <input type="submit" value="发布" class="alt_btn">
                <input type="submit" value="重置">
            </div>
        </footer>
    </article><!-- end of post new article -->

    <h4 class="alert_warning">A Warning Alert</h4>

    <h4 class="alert_error">An Error Message</h4>

    <h4 class="alert_success">A Success Message</h4>

    <article class="module width_full">
        <header><h3>Basic Styles</h3></header>
        <div class="module_content">
            <h1>Header 1</h1>
            <h2>Header 2</h2>
            <h3>Header 3</h3>
            <h4>Header 4</h4>
            <p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras mattis
                consectetur purus sit amet fermentum. Maecenas faucibus mollis interdum. Maecenas faucibus mollis
                interdum. Cras justo odio, dapibus ac facilisis in, egestas eget quam.</p>

            <p>Donec id elit non mi porta <a href="#">link text</a> gravida at eget metus. Donec ullamcorper nulla non
                metus auctor fringilla. Cras mattis consectetur purus sit amet fermentum. Aenean eu leo quam.
                Pellentesque ornare sem lacinia quam venenatis vestibulum.</p>

            <ul>
                <li>Donec ullamcorper nulla non metus auctor fringilla.</li>
                <li>Cras mattis consectetur purus sit amet fermentum.</li>
                <li>Donec ullamcorper nulla non metus auctor fringilla.</li>
                <li>Cras mattis consectetur purus sit amet fermentum.</li>
            </ul>
        </div>
    </article><!-- end of styles article -->
    <div class="spacer"></div>
</section>


</body>

</html>