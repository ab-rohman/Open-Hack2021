<!doctype html>
<html lang="en">
  <head>
    @include('layouts.head')
  </head>
  <body>

    @include('layouts.menu_bar')

<main role="main">

  @yield('content')

</main>

@include('layouts.footer')

@include('layouts.scripts')

    </body>
</html>
