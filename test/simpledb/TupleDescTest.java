




<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>CSI508_P1/test/simpledb/TupleDescTest.java at master · a0tea00/CSI508_P1</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="a0tea00/CSI508_P1" name="twitter:title" /><meta content="Contribute to CSI508_P1 development by creating an account on GitHub." name="twitter:description" /><meta content="https://1.gravatar.com/avatar/d915e662c0c56e48080589f1efe4ef91?d=https%3A%2F%2Fidenticons.github.com%2Fe84609752573f908c0f2270f5edda458.png&amp;r=x&amp;s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://1.gravatar.com/avatar/d915e662c0c56e48080589f1efe4ef91?d=https%3A%2F%2Fidenticons.github.com%2Fe84609752573f908c0f2270f5edda458.png&amp;r=x&amp;s=400" property="og:image" /><meta content="a0tea00/CSI508_P1" property="og:title" /><meta content="https://github.com/a0tea00/CSI508_P1" property="og:url" /><meta content="Contribute to CSI508_P1 development by creating an account on GitHub." property="og:description" />

    <meta name="hostname" content="github-fe133-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 2.1.0p0-github-tcmalloc (87c9373a41) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="4A469175:3290:10FD681:53097383" name="octolytics-dimension-request_id" /><meta content="4536001" name="octolytics-actor-id" /><meta content="a0tea00" name="octolytics-actor-login" /><meta content="310404b44850697d7e85488b241e8902fb2ff3607f36ae789fe41e3e13174dfa" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="o53dtjiFTQmAHGLPprNzvqyaZcH+pipveQy5ej/DpSs=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-22cc6aa8138609ccbf0c65025e153af581662ef6.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-dd234c178c0a2e0769bab2b5c636ce8f3fc1f02a.css" media="all" rel="stylesheet" type="text/css" />
    
    


      <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-01ab94ef47d6293597922a1fab60e274e1d8f37e.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-a8a26802e0e7283b39ee4507af78950399f2a5d1.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="df411d3c97b15f5ab1e253f83d14f069">

        <link data-pjax-transient rel='permalink' href='/a0tea00/CSI508_P1/blob/95fe900b3c126fb31971dab01e1bc668e561d9d2/test/simpledb/TupleDescTest.java'>

  <meta name="description" content="Contribute to CSI508_P1 development by creating an account on GitHub." />

  <meta content="4536001" name="octolytics-dimension-user_id" /><meta content="a0tea00" name="octolytics-dimension-user_login" /><meta content="16822102" name="octolytics-dimension-repository_id" /><meta content="a0tea00/CSI508_P1" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="16822102" name="octolytics-dimension-repository_network_root_id" /><meta content="a0tea00/CSI508_P1" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/a0tea00/CSI508_P1/commits/master.atom" rel="alternate" title="Recent Commits to CSI508_P1:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public page-blob tipsy-tooltips">
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-gotokey="n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="a0tea00"
      data-repo="a0tea00/CSI508_P1"
      data-branch="master"
      data-sha="72666902e9fe6d66fbfc298b0e963235113bab21"
  >

    <input type="hidden" name="nwo" value="a0tea00/CSI508_P1" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/a0tea00" class="name">
        <img alt="Trey Huang" class=" js-avatar" data-user="4536001" height="20" src="https://2.gravatar.com/avatar/d915e662c0c56e48080589f1efe4ef91?d=https%3A%2F%2Fidenticons.github.com%2Fe84609752573f908c0f2270f5edda458.png&amp;r=x&amp;s=140" width="20" /> a0tea00
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <a class="tooltipped tooltipped-s" href="/logout" data-method="post" id="logout" aria-label="Sign out">
        <span class="octicon octicon-log-out"></span>
      </a>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="section-title">
      <span title="a0tea00/CSI508_P1">This repository</span>
    </li>
      <li>
        <a href="/a0tea00/CSI508_P1/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
      <li>
        <a href="/a0tea00/CSI508_P1/settings/collaboration"><span class="octicon octicon-person-add"></span> New collaborator</a>
      </li>
</ul>

</div>


    
  </div>
</div>

      

        




          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="o53dtjiFTQmAHGLPprNzvqyaZcH+pipveQy5ej/DpSs=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="16822102" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/a0tea00/CSI508_P1/watchers">
        1
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-unwatch"></span>
          Unwatch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/a0tea00/CSI508_P1/unstar"
      class="minibutton with-count js-toggler-target star-button starred"
      aria-label="Unstar this repository" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/a0tea00/CSI508_P1/star"
      class="minibutton with-count js-toggler-target star-button unstarred"
      aria-label="Star this repository" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/a0tea00/CSI508_P1/stargazers">
        0
      </a>
  </div>

  </li>


        <li>
          <a href="/a0tea00/CSI508_P1/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork this repo" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/a0tea00/CSI508_P1/network" class="social-count">0</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author">
            <a href="/a0tea00" class="url fn" itemprop="url" rel="author"><span itemprop="title">a0tea00</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/a0tea00/CSI508_P1" class="js-current-repository js-repo-home-link">CSI508_P1</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/a0tea00/CSI508_P1" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /a0tea00/CSI508_P1">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/a0tea00/CSI508_P1/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="i" data-selected-links="repo_issues /a0tea00/CSI508_P1/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/a0tea00/CSI508_P1/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /a0tea00/CSI508_P1/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/a0tea00/CSI508_P1/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /a0tea00/CSI508_P1/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/a0tea00/CSI508_P1/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /a0tea00/CSI508_P1/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/a0tea00/CSI508_P1/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /a0tea00/CSI508_P1/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/a0tea00/CSI508_P1/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /a0tea00/CSI508_P1/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


      <div class="sunken-menu-separator"></div>
      <ul class="sunken-menu-group">
        <li class="tooltipped tooltipped-w" aria-label="Settings">
          <a href="/a0tea00/CSI508_P1/settings"
            class="sunken-menu-item" data-pjax aria-label="Settings">
            <span class="octicon octicon-tools"></span> <span class="full-word">Settings</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </a>
        </li>
      </ul>
  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=push">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/a0tea00/CSI508_P1.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/a0tea00/CSI508_P1.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=push">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:a0tea00/CSI508_P1.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:a0tea00/CSI508_P1.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=push">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/a0tea00/CSI508_P1" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/a0tea00/CSI508_P1" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>


  <a href="github-windows://openRepo/https://github.com/a0tea00/CSI508_P1" class="minibutton sidebar-button">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/a0tea00/CSI508_P1/archive/master.zip"
                   class="minibutton sidebar-button"
                   title="Download this repository as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:3d44170852b9c1d2ad111dc4b7c8d3cb -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/a0tea00/CSI508_P1/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/a0tea00/CSI508_P1/blob/master/test/simpledb/TupleDescTest.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <form accept-charset="UTF-8" action="/a0tea00/CSI508_P1/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="o53dtjiFTQmAHGLPprNzvqyaZcH+pipveQy5ej/DpSs=" /></div>
            <span class="octicon octicon-git-branch-create select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <h4>Create branch: <span class="js-new-item-name"></span></h4>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master" />
            <input type="hidden" name="path" id="path" value="test/simpledb/TupleDescTest.java" />
          </form> <!-- /.select-menu-item -->

      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/a0tea00/CSI508_P1" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">CSI508_P1</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/a0tea00/CSI508_P1/tree/master/test" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">test</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/a0tea00/CSI508_P1/tree/master/test/simpledb" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">simpledb</span></a></span><span class="separator"> / </span><strong class="final-path">TupleDescTest.java</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="test/simpledb/TupleDescTest.java" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit file-history-tease">
    <img class="main-avatar" height="24" src="https://1.gravatar.com/avatar/929db908e84d55667d15ddd5f1486d88?d=https%3A%2F%2Fa248.e.akamai.net%2Fassets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png&amp;r=x&amp;s=140" width="24" />
    <span class="author"><span rel="author">Trey Huang</span></span>
    <time class="js-relative-date" data-title-format="YYYY-MM-DD HH:mm:ss" datetime="2014-02-14T08:15:32-08:00" title="2014-02-14 08:15:32">February 14, 2014</time>
    <div class="commit-title">
        <a href="/a0tea00/CSI508_P1/commit/95fe900b3c126fb31971dab01e1bc668e561d9d2" class="message" data-pjax="true" title="update test file from professor">update test file from professor</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>0</strong> contributors</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>183 lines (166 sloc)</span>
          <span class="meta-divider"></span>
        <span>6.301 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/a0tea00/CSI508_P1?branch=master&amp;filepath=test%2Fsimpledb%2FTupleDescTest.java" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton js-update-url-with-hash"
                   href="/a0tea00/CSI508_P1/edit/master/test/simpledb/TupleDescTest.java"
                   data-method="post" rel="nofollow" data-hotkey="e">Edit</a>
          <a href="/a0tea00/CSI508_P1/raw/master/test/simpledb/TupleDescTest.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/a0tea00/CSI508_P1/blame/master/test/simpledb/TupleDescTest.java" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/a0tea00/CSI508_P1/commits/master/test/simpledb/TupleDescTest.java" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->
          <a class="minibutton danger empty-icon tooltipped tooltipped-s"
             href="/a0tea00/CSI508_P1/delete/master/test/simpledb/TupleDescTest.java"
             aria-label=""
             data-method="post" data-test-id="delete-blob-file" rel="nofollow">
          Delete
        </a>
      </div><!-- /.actions -->
    </div>
        <div class="blob-wrapper data type-java js-blob-data">
        <table class="file-code file-diff tab-size-8">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">simpledb</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">org.junit.Test</span><span class="o">;</span></div><div class='line' id='LC4'><br/></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">simpledb.systemtest.SimpleDbTestBase</span><span class="o">;</span></div><div class='line' id='LC6'><br/></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">static</span> <span class="n">org</span><span class="o">.</span><span class="na">junit</span><span class="o">.</span><span class="na">Assert</span><span class="o">.*;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">junit.framework.JUnit4TestAdapter</span><span class="o">;</span></div><div class='line' id='LC9'><br/></div><div class='line' id='LC10'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">TupleDescTest</span> <span class="kd">extends</span> <span class="n">SimpleDbTestBase</span> <span class="o">{</span></div><div class='line' id='LC11'><br/></div><div class='line' id='LC12'><span class="c1">//    /**</span></div><div class='line' id='LC13'><span class="c1">//     * Unit test for TupleDesc.combine()</span></div><div class='line' id='LC14'><span class="c1">//     */</span></div><div class='line' id='LC15'><span class="c1">//    @Test public void combine() {</span></div><div class='line' id='LC16'><span class="c1">//        TupleDesc td1, td2, td3;</span></div><div class='line' id='LC17'><span class="c1">//</span></div><div class='line' id='LC18'><span class="c1">//        td1 = Utility.getTupleDesc(1, &quot;td1&quot;);</span></div><div class='line' id='LC19'><span class="c1">//        td2 = Utility.getTupleDesc(2, &quot;td2&quot;);</span></div><div class='line' id='LC20'><span class="c1">//</span></div><div class='line' id='LC21'><span class="c1">//        // test td1.combine(td2)</span></div><div class='line' id='LC22'><span class="c1">//        td3 = TupleDesc.combine(td1, td2);</span></div><div class='line' id='LC23'><span class="c1">//        assertEquals(3 , td3.numFields());</span></div><div class='line' id='LC24'><span class="c1">//        assertEquals(3 * Type.INT_TYPE.getLen(), td3.getSize());</span></div><div class='line' id='LC25'><span class="c1">//        for (int i = 0; i &lt; 3; ++i)</span></div><div class='line' id='LC26'><span class="c1">//            assertEquals(Type.INT_TYPE, td3.getType(i));</span></div><div class='line' id='LC27'><span class="c1">//        assertEquals(combinedStringArrays(td1, td2, td3), true);</span></div><div class='line' id='LC28'><span class="c1">//</span></div><div class='line' id='LC29'><span class="c1">//        // test td2.combine(td1)</span></div><div class='line' id='LC30'><span class="c1">//        td3 = TupleDesc.combine(td2, td1);</span></div><div class='line' id='LC31'><span class="c1">//        assertEquals(3 , td3.numFields());</span></div><div class='line' id='LC32'><span class="c1">//        assertEquals(3 * Type.INT_TYPE.getLen(), td3.getSize());</span></div><div class='line' id='LC33'><span class="c1">//        for (int i = 0; i &lt; 3; ++i)</span></div><div class='line' id='LC34'><span class="c1">//            assertEquals(Type.INT_TYPE, td3.getType(i));</span></div><div class='line' id='LC35'><span class="c1">//        assertEquals(combinedStringArrays(td2, td1, td3), true);</span></div><div class='line' id='LC36'><span class="c1">//</span></div><div class='line' id='LC37'><span class="c1">//        // test td2.combine(td2)</span></div><div class='line' id='LC38'><span class="c1">//        td3 = TupleDesc.combine(td2, td2);</span></div><div class='line' id='LC39'><span class="c1">//        assertEquals(4 , td3.numFields());</span></div><div class='line' id='LC40'><span class="c1">//        assertEquals(4 * Type.INT_TYPE.getLen(), td3.getSize());</span></div><div class='line' id='LC41'><span class="c1">//        for (int i = 0; i &lt; 4; ++i)</span></div><div class='line' id='LC42'><span class="c1">//            assertEquals(Type.INT_TYPE, td3.getType(i));</span></div><div class='line' id='LC43'><span class="c1">//        assertEquals(combinedStringArrays(td2, td2, td3), true);</span></div><div class='line' id='LC44'><span class="c1">//    }</span></div><div class='line' id='LC45'><br/></div><div class='line' id='LC46'><span class="c1">//    /**</span></div><div class='line' id='LC47'><span class="c1">//     * Ensures that combined&#39;s field names = td1&#39;s field names + td2&#39;s field names</span></div><div class='line' id='LC48'><span class="c1">//     */</span></div><div class='line' id='LC49'><span class="c1">//    private boolean combinedStringArrays(TupleDesc td1, TupleDesc td2, TupleDesc combined) {</span></div><div class='line' id='LC50'><span class="c1">//        for (int i = 0; i &lt; td1.numFields(); i++) {</span></div><div class='line' id='LC51'><span class="c1">//            if (!(((td1.getFieldName(i) == null) &amp;&amp; (combined.getFieldName(i) == null)) ||</span></div><div class='line' id='LC52'><span class="c1">//                    td1.getFieldName(i).equals(combined.getFieldName(i)))) {</span></div><div class='line' id='LC53'><span class="c1">//                return false;</span></div><div class='line' id='LC54'><span class="c1">//            }</span></div><div class='line' id='LC55'><span class="c1">//        }</span></div><div class='line' id='LC56'><span class="c1">//</span></div><div class='line' id='LC57'><span class="c1">//        for (int i = td1.numFields(); i &lt; td1.numFields() + td2.numFields(); i++) {</span></div><div class='line' id='LC58'><span class="c1">//            if (!(((td2.getFieldName(i-td1.numFields()) == null) &amp;&amp; (combined.getFieldName(i) == null)) ||</span></div><div class='line' id='LC59'><span class="c1">//                    td2.getFieldName(i-td1.numFields()).equals(combined.getFieldName(i)))) {</span></div><div class='line' id='LC60'><span class="c1">//                return false;</span></div><div class='line' id='LC61'><span class="c1">//            }</span></div><div class='line' id='LC62'><span class="c1">//        }</span></div><div class='line' id='LC63'><span class="c1">//</span></div><div class='line' id='LC64'><span class="c1">//        return true;</span></div><div class='line' id='LC65'><span class="c1">//    }</span></div><div class='line' id='LC66'><br/></div><div class='line' id='LC67'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC68'><span class="cm">     * Unit test for TupleDesc.getType()</span></div><div class='line' id='LC69'><span class="cm">     */</span></div><div class='line' id='LC70'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Test</span> <span class="kd">public</span> <span class="kt">void</span> <span class="n">getType</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span><span class="o">[]</span> <span class="n">lengths</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">int</span><span class="o">[]</span> <span class="o">{</span> <span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">1000</span> <span class="o">};</span></div><div class='line' id='LC72'><br/></div><div class='line' id='LC73'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="nl">len:</span> <span class="n">lengths</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC74'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">TupleDesc</span> <span class="n">td</span> <span class="o">=</span> <span class="n">Utility</span><span class="o">.</span><span class="na">getTupleDesc</span><span class="o">(</span><span class="n">len</span><span class="o">);</span></div><div class='line' id='LC75'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">len</span><span class="o">;</span> <span class="o">++</span><span class="n">i</span><span class="o">)</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="n">Type</span><span class="o">.</span><span class="na">INT_TYPE</span><span class="o">,</span> <span class="n">td</span><span class="o">.</span><span class="na">getType</span><span class="o">(</span><span class="n">i</span><span class="o">));</span></div><div class='line' id='LC77'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC78'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC79'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC80'><span class="c1">//    /**</span></div><div class='line' id='LC81'><span class="c1">//     * Unit test for TupleDesc.nameToId()</span></div><div class='line' id='LC82'><span class="c1">//     */</span></div><div class='line' id='LC83'><span class="c1">//    @Test public void nameToId() {</span></div><div class='line' id='LC84'><span class="c1">//        int[] lengths = new int[] { 1, 2, 1000 };</span></div><div class='line' id='LC85'><span class="c1">//        String prefix = &quot;test&quot;;</span></div><div class='line' id='LC86'><span class="c1">//        </span></div><div class='line' id='LC87'><span class="c1">//        for (int len: lengths) {</span></div><div class='line' id='LC88'><span class="c1">//            // Make sure you retrieve well-named fields</span></div><div class='line' id='LC89'><span class="c1">//            TupleDesc td = Utility.getTupleDesc(len, prefix);</span></div><div class='line' id='LC90'><span class="c1">//            for (int i = 0; i &lt; len; ++i) {</span></div><div class='line' id='LC91'><span class="c1">//                assertEquals(i, td.nameToId(prefix + i));</span></div><div class='line' id='LC92'><span class="c1">//            }</span></div><div class='line' id='LC93'><span class="c1">//            </span></div><div class='line' id='LC94'><span class="c1">//            // Make sure you throw exception for non-existent fields</span></div><div class='line' id='LC95'><span class="c1">//            try {</span></div><div class='line' id='LC96'><span class="c1">//                td.nameToId(&quot;foo&quot;);</span></div><div class='line' id='LC97'><span class="c1">//                Assert.fail(&quot;foo is not a valid field name&quot;);</span></div><div class='line' id='LC98'><span class="c1">//            } catch (NoSuchElementException e) {</span></div><div class='line' id='LC99'><span class="c1">//                // expected to get here</span></div><div class='line' id='LC100'><span class="c1">//            }</span></div><div class='line' id='LC101'><span class="c1">//            </span></div><div class='line' id='LC102'><span class="c1">//            // Make sure you throw exception for null searches</span></div><div class='line' id='LC103'><span class="c1">//            try {</span></div><div class='line' id='LC104'><span class="c1">//                td.nameToId(null);</span></div><div class='line' id='LC105'><span class="c1">//                Assert.fail(&quot;null is not a valid field name&quot;);</span></div><div class='line' id='LC106'><span class="c1">//            } catch (NoSuchElementException e) {</span></div><div class='line' id='LC107'><span class="c1">//                // expected to get here</span></div><div class='line' id='LC108'><span class="c1">//            }</span></div><div class='line' id='LC109'><span class="c1">//</span></div><div class='line' id='LC110'><span class="c1">//            // Make sure you throw exception when all field names are null</span></div><div class='line' id='LC111'><span class="c1">//            td = Utility.getTupleDesc(len);</span></div><div class='line' id='LC112'><span class="c1">//            try {</span></div><div class='line' id='LC113'><span class="c1">//                td.nameToId(prefix);</span></div><div class='line' id='LC114'><span class="c1">//                Assert.fail(&quot;no fields are named, so you can&#39;t find it&quot;);</span></div><div class='line' id='LC115'><span class="c1">//            } catch (NoSuchElementException e) {</span></div><div class='line' id='LC116'><span class="c1">//                // expected to get here</span></div><div class='line' id='LC117'><span class="c1">//            }</span></div><div class='line' id='LC118'><span class="c1">//        }</span></div><div class='line' id='LC119'><span class="c1">//    }    </span></div><div class='line' id='LC120'><br/></div><div class='line' id='LC121'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC122'><span class="cm">     * Unit test for TupleDesc.getSize()</span></div><div class='line' id='LC123'><span class="cm">     */</span></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Test</span> <span class="kd">public</span> <span class="kt">void</span> <span class="n">getSize</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span><span class="o">[]</span> <span class="n">lengths</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">int</span><span class="o">[]</span> <span class="o">{</span> <span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">1000</span> <span class="o">};</span></div><div class='line' id='LC126'><br/></div><div class='line' id='LC127'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="nl">len:</span> <span class="n">lengths</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">TupleDesc</span> <span class="n">td</span> <span class="o">=</span> <span class="n">Utility</span><span class="o">.</span><span class="na">getTupleDesc</span><span class="o">(</span><span class="n">len</span><span class="o">);</span></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="n">len</span> <span class="o">*</span> <span class="n">Type</span><span class="o">.</span><span class="na">INT_TYPE</span><span class="o">.</span><span class="na">getLen</span><span class="o">(),</span> <span class="n">td</span><span class="o">.</span><span class="na">getSize</span><span class="o">());</span></div><div class='line' id='LC130'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC131'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC132'><br/></div><div class='line' id='LC133'><span class="c1">//    /**</span></div><div class='line' id='LC134'><span class="c1">//     * Unit test for TupleDesc.numFields()</span></div><div class='line' id='LC135'><span class="c1">//     */</span></div><div class='line' id='LC136'><span class="c1">//    @Test public void numFields() {</span></div><div class='line' id='LC137'><span class="c1">//        int[] lengths = new int[] { 1, 2, 1000 };</span></div><div class='line' id='LC138'><span class="c1">//</span></div><div class='line' id='LC139'><span class="c1">//        for (int len : lengths) {</span></div><div class='line' id='LC140'><span class="c1">//            TupleDesc td = Utility.getTupleDesc(len);</span></div><div class='line' id='LC141'><span class="c1">//            assertEquals(len, td.numFields());</span></div><div class='line' id='LC142'><span class="c1">//        }</span></div><div class='line' id='LC143'><span class="c1">//    }</span></div><div class='line' id='LC144'><br/></div><div class='line' id='LC145'><span class="c1">//    @Test public void testEquals() {</span></div><div class='line' id='LC146'><span class="c1">//        TupleDesc singleInt = new TupleDesc(new Type[]{Type.INT_TYPE});</span></div><div class='line' id='LC147'><span class="c1">//        TupleDesc singleInt2 = new TupleDesc(new Type[]{Type.INT_TYPE});</span></div><div class='line' id='LC148'><span class="c1">//        TupleDesc intString = new TupleDesc(new Type[]{Type.INT_TYPE, Type.STRING_TYPE});</span></div><div class='line' id='LC149'><span class="c1">//</span></div><div class='line' id='LC150'><span class="c1">//        // .equals() with null should return false</span></div><div class='line' id='LC151'><span class="c1">//        assertFalse(singleInt.equals(null));</span></div><div class='line' id='LC152'><span class="c1">//</span></div><div class='line' id='LC153'><span class="c1">//        // .equals() with the wrong type should return false</span></div><div class='line' id='LC154'><span class="c1">//        assertFalse(singleInt.equals(new Object()));</span></div><div class='line' id='LC155'><span class="c1">//</span></div><div class='line' id='LC156'><span class="c1">//        assertTrue(singleInt.equals(singleInt));</span></div><div class='line' id='LC157'><span class="c1">//        assertTrue(singleInt.equals(singleInt2));</span></div><div class='line' id='LC158'><span class="c1">//        assertTrue(singleInt2.equals(singleInt));</span></div><div class='line' id='LC159'><span class="c1">//        assertTrue(intString.equals(intString));</span></div><div class='line' id='LC160'><span class="c1">//</span></div><div class='line' id='LC161'><span class="c1">//        assertFalse(singleInt.equals(intString));</span></div><div class='line' id='LC162'><span class="c1">//        assertFalse(singleInt2.equals(intString));</span></div><div class='line' id='LC163'><span class="c1">//        assertFalse(intString.equals(singleInt));</span></div><div class='line' id='LC164'><span class="c1">//        assertFalse(intString.equals(singleInt2));</span></div><div class='line' id='LC165'><span class="c1">//    }</span></div><div class='line' id='LC166'><br/></div><div class='line' id='LC167'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC168'><span class="cm">     * Unit test for TupleDesc.toString()</span></div><div class='line' id='LC169'><span class="cm">     */</span></div><div class='line' id='LC170'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Test</span> <span class="kd">public</span> <span class="kt">void</span> <span class="n">toStringTest</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC171'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">TupleDesc</span> <span class="n">intString</span> <span class="o">=</span> <span class="k">new</span> <span class="n">TupleDesc</span><span class="o">(</span><span class="k">new</span> <span class="n">Type</span><span class="o">[]{</span><span class="n">Type</span><span class="o">.</span><span class="na">INT_TYPE</span><span class="o">,</span> <span class="n">Type</span><span class="o">.</span><span class="na">STRING_TYPE</span><span class="o">},</span> <span class="k">new</span> <span class="n">String</span><span class="o">[]{</span><span class="s">&quot;ID&quot;</span><span class="o">,</span> <span class="s">&quot;Name&quot;</span><span class="o">});</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertTrue</span><span class="o">(</span><span class="s">&quot;INT_TYPE(ID)|STRING_TYPE(Name)&quot;</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">intString</span><span class="o">.</span><span class="na">toString</span><span class="o">()));</span></div><div class='line' id='LC173'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC174'><br/></div><div class='line' id='LC175'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC176'><span class="cm">     * JUnit suite target</span></div><div class='line' id='LC177'><span class="cm">     */</span></div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">junit</span><span class="o">.</span><span class="na">framework</span><span class="o">.</span><span class="na">Test</span> <span class="nf">suite</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC179'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JUnit4TestAdapter</span><span class="o">(</span><span class="n">TupleDescTest</span><span class="o">.</span><span class="na">class</span><span class="o">);</span></div><div class='line' id='LC180'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC181'><span class="o">}</span></div><div class='line' id='LC182'><br/></div></pre></div></td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.04075s from github-fe133-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

      <div class="hidden" id="js-avatars" data-url="https://avatars.github.com"></div>
  </body>
</html>

